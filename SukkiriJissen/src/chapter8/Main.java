package chapter8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;

public class Main {

	public static void main(String[] args) throws IOException {
		// https://dokojava.jpを取得する
		URL url = new URL("https://dokojava.jp");

		// openStream()メソッドを呼び出して、データを取り出す
		InputStream is = url.openStream();

		// inputStreamReader()メソッドを呼び出して、isを読み込む
		InputStreamReader isr = new InputStreamReader(is);

		// read()メソッドを呼び出して、ストリームから1バイトずつ情報を取りだす
		int i = isr.read();

		while (i != -1) {
			System.out.print((char)i);
			i = isr.read();
		}

		// close()メソッドでisrをクローズする
		isr.close();


		// Socketを用いてWebページを取得する
		Socket sock = new Socket("dokojava.jp", 80);

		// Socketから入力ストリームと出力ストリームを取得する
		InputStream is1 = sock.getInputStream();
		OutputStream os = sock.getOutputStream();

		// 2つのストリームを読み書きする
		os.write("GET /index.html HTTP/1.0\r\n".getBytes());
		os.write("\r\n".getBytes());
		os.flush();

		// inputStreamReader()メソッドを呼び出して、is1を読み込む
		InputStreamReader isr1 = new InputStreamReader(is1);

		// read()メソッドを呼び出して、ストリームから1バイトずつ情報を取りだす
		int i1 = isr1.read();

		while (i1 != -1) {
			System.out.print((char) i1);
			i1 = isr1.read();
		}

		sock.close();

		/*
		 * TCP/IPを利用する場合は、java.net.Socketをインポートし、
		 * UDPを利用する場合は、java.net.DataStreamをインポートする
		 */


		// ServerSocketを使ったサーバプログラム
		System.out.println("起動完了");
		ServerSocket svsock = new ServerSocket(39648);

		// acccept()メソッドを利用して通信を待ち受ける
		Socket sock1 = svsock.accept();
		System.out.println(sock1.getInetAddress() + "からの接続");
		sock1.getOutputStream().write("WELCOME".getBytes());
		sock1.getOutputStream().flush();

		// close()メソッドでデータを送信して切断する
		sock1.close();



		// 章末問題8-1
		URL url1 = new URL("https://dokojava.jp/favicon.ico");
		InputStream is2 = url.openStream();
		OutputStream os2 = new FileOutputStream("dj.ico");
		int i2 = is2.read();
		while (i2 != -1) {
			os2.write((byte) i2);
			i2 = is2.read();
		}

		is2.close();
		os2.flush();
		os2.close();


		// 章末問題8-2
		Socket sock2 = new Socket("smtp.example.com", 60025);
		OutputStream os3 = sock2.getOutputStream();
		os3.write("HELO smtp.example.com\r\n".getBytes());
		os3.flush();
		sock2.close();


		// 章末問題8-3
		String url2 = "https://api.github.com./users/miyabilink";
		HttpClient client = HttpClient.newBuilder()
				.version(Version.HTTP1_1)
				.followRedirects(Redirect.NORMAL)
				.build();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(url2))
				.header("Accept", "application/vnd.guithub.v3+json")
				.GET()
				.build();
		HttoResponce<String> res = client.send(request, HttpResponce.BodyHandlera.ofString());
		String body = res.body();
		int status = res.statusCode();
		if (status == 200) {
			ObjectMapper mapper = new ObjectMapper();
			JsonNode root = mapper.readTree(body);
			String blog = root.get("blog").textValue();
			System.out.println(blog);
		} else {
			System.out.println("ERROR：" + status);
		}
	}

}
