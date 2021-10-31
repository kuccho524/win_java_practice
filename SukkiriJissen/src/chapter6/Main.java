package chapter6;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.zip.GZIPOutputStream;

public class Main {

	public static void main(String[] args) throws IOException {
		// FileWiterをインスタンス化する
		FileWriter fw = new FileWriter("c:\\rpgsave.dat", true);
		fw.write("A");

		// flush()を呼び出す
		fw.flush();

		// close()を呼び出す
		fw.close();


		// FileReaderを用いたサンプルコード
		FileReader fr = new FileReader("rpgsave.dat");
		System.out.println("すべてのデータを読んで表示します");
		int i = fr.read();
		while (i != -1) {
			char c = (char)i;
			System.out.println(c);
			i = fr.read();
		}
		System.out.println("ファイルの末尾に到達しました");
		fr.close();


		// 例外処理をしたコード
		FileOutputStream fos = new FileOutputStream("rpgsave.dat", true);
		fos.write(65);
		fos.flush();
		fos.close();

		// 例外処理を記述したコード
		FileWriter fw2 = null;
		try {
			fw2 = new FileWriter("rpgsave.dat", true);
			fw2.write('A');
			fw2.flush();
		} catch (IOException e) {
			System.out.println("ファイル書き込みエラーです");
		} finally {
			if (fw != null) {
				try {
					fw2.close();
				} catch (IOException e2) {}
			}
		}


		// try-with-resourcesを使用したコード
		try (
			FileWriter fw3 = new FileWriter("rpgsave.dat", true)
		) {
			fw3.write('A');
			fw3.flush();
		} catch (IOException e) {
			System.out.println("ファイル書き込みエラーです");
		}


		// 文字列型の変数から１文字ずつ読み取る
		String msg = "第１土曜日は資源ゴミの回収です";
		Reader sr = new StringReader(msg);
		System.out.println((char)sr.read());
		System.out.println((char)sr.read());


		// バイト列に値を書き込む
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		baos.write(65);
		baos.write(66);
		byte[] data = baos.toByteArray();
		for(byte b :data) {
			System.out.println(b);
		}


		// 練習問題6-1
		String inFile = args[0];
		String outFile = args[1];
		FileInputStream fis = new FileInputStream(inFile);
		FileOutputStream fos2 = new FileOutputStream(outFile);
		int j = fis.read();
		while (j != -1) {
			fos.write(j);
			j = fis.read();
		}
		fos2.flush();
		fos2.close();
		fis.close();


		// 練習問題6-2
		if (args.length != 2) {
			System.out.println("起動パラメータが不正です");
			return;
		}

		String inFile1 = args[0];
		String outFile1 =args[1];

		try (
				FileInputStream fis1 = new FileInputStream(inFile1);
				FileOutputStream fos3 = new FileOutputStream(outFile1);
				BufferedOutputStream bos = new BufferedOutputStream(fos3);
				GZIPOutputStream gzos = new GZIPOutputStream(bos);
			) {
			int h = fis1.read();
			while (h != -1) {
				gzos.write(h);
				h = fis1.read();
			}
			gzos.flush();
		} catch (IOException e) {
			System.out.println("ファイル処理に失敗しました");
		}
	}

}
