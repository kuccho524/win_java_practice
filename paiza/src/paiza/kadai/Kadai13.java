package paiza.kadai;

import java.util.Scanner;

public class Kadai13 {
	public static void main(String[] args) {
		// 入力値を受け取る変数scanを宣言
		Scanner scan = new Scanner(System.in);

		// 整数型を持つ変数numberを宣言
		int number = scan.nextInt();

		// numberが100以上の時、numberを表示する
		if (number >= 100) {
			System.out.println(number);
		}
	}
}
