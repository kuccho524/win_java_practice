package paiza.kadai;

import java.util.Scanner;

public class Kadai16 {
	public static void main(String[] args) {
		// 入力値を受け取る変数scanを宣言
		Scanner scan = new Scanner(System.in);

		// String型を持つ変数greetingを宣言
		String greeting = scan.next();

		/*
		 * ・greetingの文字列が「Hello」と等しい時、「こんにちは」と出力する
		 * ・等しくないときは「さようなら」と表示する
		 */

		if(greeting.equals("Hello")) {
			System.out.println("こんにちは");
		} else {
			System.out.println("さようなら");
		}
	}
}
