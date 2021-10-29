package review.chapter17;

// java.ioクラスをインポートする
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		/*
		 * try-catch構文で例外処理をする
		 */

		// 「NullPointerException」をcatchしましたと表示する
		try {
			// String型を持つ変数sにnullを代入
			String s = null;

			// s.lengthの内容を表示する
			System.out.println(s.length());
		} catch(NullPointerException e) {
			System.out.println("NullPointerExceptionをキャッチしました");
			System.out.println("--スタックとレース（ここから）--");
			e.printStackTrace();
			System.out.println("--スタックとレース（ここまで）--");
		}

		try {
			int i = Integer.parseInt("三");
		} catch (NumberFormatException e) {
			System.out.println("例外が発生しました");
		}

		// 「異常終了」と出力する
		System.out.println("異常終了");

		// 例外をスローする
		throw new IOException();
	}

}
