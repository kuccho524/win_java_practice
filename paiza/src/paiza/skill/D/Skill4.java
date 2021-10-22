package paiza.skill.D;

import java.util.Scanner;

/*
 * 多角形の和を求める
 */

public class Skill4 {
	public static void main(String[] args) {
		// 入力値を受け取る変数scanを定義
		Scanner scan = new Scanner(System.in);

		// 変数scanをint型を持つ変数totalに格納
		int total = scan.nextInt();

		// 多角形の和を表示する
		System.out.println(total / 180 + 2);
	}
}
