package paiza.skill.D;

import java.util.Scanner;

/*
 * 取得した数値が奇数の時「odd」、偶数の時「even」と表示する
 */

public class Skill2 {
	public static void main(String[] args) {
		// 入力値を受け取る変数scanを宣言
		Scanner scan = new Scanner(System.in);

		// int型を持つ変数numberに値を格納
		int number = scan.nextInt();

		// 奇数/偶数の時で表示内容を分岐する
		if (number % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}
}
