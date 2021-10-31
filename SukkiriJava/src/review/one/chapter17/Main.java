package review.one.chapter17;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// String型を持つ変数sにnullを格納し、length()メソッドで内容を表示する
		String s = null;

		// try-catch文で例外処理をする
		try {
			s.length();
		} catch (NullPointerException e) {
			System.out.println("NullPointerException例外をcatchしました");
			// スタックとレースを表示する
			System.out.println("--スタックトレース（ここから）--");
			e.printStackTrace();  // catchで定義したローカル変数を忘れないこと！！
			System.out.println("--スタックトレース（ここまで）--");
		}


		// 文字列「三」をint型に変換する時の例外処理を記述
		try {
			int i = Integer.parseInt("三");
		} catch (NumberFormatException e) {
			System.out.println("例外が発生しました");
		}

		// 異常終了するようなプログラムを作成
		System.out.println("プログラムが起動しました");
		throw new IOException();


	}

}
