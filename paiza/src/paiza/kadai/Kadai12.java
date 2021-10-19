package paiza.kadai;

import java.util.Scanner;

public class Kadai12 {
	public static void main(String[] args) {
		//入力値を受け取る変数scanを宣言
		Scanner scan = new Scanner(System.in);

		// 整数値を受け取る変数numberを宣言
		int number = scan.nextInt();

		// 変数numberを出力
		System.out.println(number);

		// 変数numberの値と文字列を結合する
		System.out.println("まんじゅうが" + number + "個");
	}
}
