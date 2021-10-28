package chapter17;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	// mainメソッドがお手上げする = throwsで例外をスローする
	public static void main(String[] args) throws IOException {
		/*
		 * 例外処理の基本パターン
		 * try {
		 * 		通常実行される文（本来の処理）;
		 * 	} catch(例外クラス 変数名) {
		 * 		例外発生時に実行される文（処理）;
		 * 	}
		 */

		try {
			FileWriter fw = new FileWriter("data.txt");
			fw.write("hello");
			fw.close();
		} catch(IOException e) {
			System.out.println("何らかの例外が発生しました");
		}

		/*
		 * 例外処理の基本パターン
		 * try {
		 * 		通常実行される文（本来の処理）;
		 * 	} catch(例外クラス 変数名) {
		 * 		例外発生時に実行される文（処理）;
		 * 	} finally {
		 * 		例外があってもなくも必ず実行する処理;
		 * 	}
		 */

		FileWriter fw1 = null;
		try {
			fw1 = new FileWriter("data.txt");
			fw1.write("hello");
		} catch (Exception e) {
			System.out.println("何らかの例外が発生しました");
		} finally {
			if (fw1 != null) {
				try {
					fw1.close();
				} catch(IOException e) {
					;
				}
			}
		}

		/*
		 * try-with-resources文
		 * try (closeによる後片付けが必要な変数の宣言;) {
		 * 		本来の処理;
		 * 	} cathch (例外クラス 変数名) {
		 * 		例外が発生した場合の処理;
		 * 	}
		 */
		try (FileWriter fw2 = new FileWriter("data.txt");) {
			fw2.write("hello");
		} catch (Exception e) {
			System.out.println("何らかの例外が発生しました");
		}

		Person p = new Person();
		p.setAge(128);

		String s = null;
		try {
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("--スタックとレース（ここから）--");
			e.printStackTrace();
			System.out.println("--スタックとレース（ここから）--");
		}

		try {
			int i = Integer.parseInt("三");
		} catch (NumberFormatException e) {
			System.out.println("例外が発生しました");
		}

		// 例外発生時に異常終了する
		System.out.println("プログラムが起動しました");
		throw new IOException();
	}
}
