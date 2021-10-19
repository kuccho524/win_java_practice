package paiza.kadai;

import java.util.Scanner;

public class Kadai15 {
	public static void main(String[] args) {
		// 入力値を受け取る変数scanを宣言
		Scanner scan = new Scanner(System.in);

		// int型を持つ変数numberを宣言
		int number = scan.nextInt();

		/*
		 * ・numberの値が100の時、numberの値を表示
		 * ・numberが100より大きい時、「100より大きい」と表示
		 * ・numberが100より小さい時、「100より小さい」と表示
		 */

		if (number == 100) {
			System.out.println(number);
		} else if (number > 100) {
			System.out.println("100より大きい");
		} else {
			System.out.println("100より小さい");
		}
	}
}
