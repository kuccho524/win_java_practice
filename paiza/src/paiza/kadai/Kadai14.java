package paiza.kadai;

import java.util.Scanner;

public class Kadai14 {
	public static void main(String[] args) {
		// 入力値を受け取る変数scanを宣言
		Scanner scan = new Scanner(System.in);

		// int型を持つ変数numberを宣言
		int number = scan.nextInt();

		// numberが100より大きい時、数値を表示し、100より小さい場合は「100以下です」と表示する
		if (number > 100) {
			System.out.println(number);
		} else {
			System.out.println("100以下です");
		}
	}
}
