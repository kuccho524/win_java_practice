package paiza.kadai;

import java.util.Scanner;

public class Kadai17 {
	public static void main(String[] args) {
		// 入力値を受け取る変数scanを宣言
		Scanner scan = new Scanner(System.in);

		// int型を持つ変数countを宣言
		int count = scan.nextInt();

		// 変数countの値の分だけ繰り返し処理をする
		for (int i = 0; i < count; i++) {
			// int型を持つ変数numberを宣言
			int number = scan.nextInt();

			/*
			 * ・numberが0の時、「numberは0」
			 * ・numberが0より大きい時、「numberはプラス」
			 * ・numberが0より小さい時、「numberはマイナス」
			 *
			 * 上記をそれぞれ条件分岐する
			 */

			if (number == 0) {
				System.out.println(number + "は0");
			} else if (number > 0) {
				System.out.println(number + "はプラス");
			} else {
				System.out.println(number + "はマイナス");
			}
		}
	}
}
