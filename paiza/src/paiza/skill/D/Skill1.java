package paiza.skill.D;

import java.util.Scanner;

/*
 * 標準入力で最初に取得した値をkm、
 * 次に取得した値をlitterとして、
 * 1リットルあたりの走行距離を求める
 * ※小数点は省く
 */

public class Skill1 {
	public static void main(String[] args) {

		// 標準入力を受け取る変数scを宣言
		Scanner sc = new Scanner(System.in);

		// int型を持つ変数kmに入力値を代入する
		int km = sc.nextInt();

		// int型を持つ変数litterに入力値を代入する
		int litter = sc.nextInt();

		// 変数kmを変数litterで割り、1ℓあたりの走行距離を求める
		System.out.println(km / litter);
	}
}
