package paiza.skill.D;

import java.util.Scanner;

/*
 * 入力された数値から絶対値を求める
 */

public class Skill3 {
	public static void main(String[] args) {
		// 「数値を入力してください」と表示
		System.out.println("数値を入力してください");

		//入力値を受け取る変数scanを宣言
		Scanner scan = new Scanner(System.in);

		// int型を持つ変数numberに入力値を格納
		int number = scan.nextInt();

		// 0未満の数値があり得るため、if文で条件分岐
		if (number >= 0) {
			System.out.println(number);
		} else {
			System.out.println(-number); // 変数の頭に「-」を付けることで正負を反転できる
		}

	}
}
