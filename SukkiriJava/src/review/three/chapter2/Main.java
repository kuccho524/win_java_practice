package review.three.chapter2;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;

		// 「x + yは 15」と出力する
		System.out.println("x + yは " + (x + y));

		/*
		 * 占いの館
		 */

		// 「ようこそ占いの館へ」と出力する
		System.out.println("ようこそ占いの館へ");

		// 「あなたの名前を入力してください」と出力する
		System.out.println("あなたの名前を入力してください");

		// 標準入力を受け付ける
		Scanner sc = new Scanner(System.in);

		// String型を持つ変数nameに入力値を格納する
		String name = sc.next();

		// 「あなたの年齢を入力してください」と出力する
		System.out.println("あなたの年齢を入力してください");

		// 入力値をString型を持つ変数ageStringに格納する
		String ageString = sc.next();

		// 変数ageSytringの値をint型を持つ変数ageに格納する
		int age = Integer.parseInt(ageString);

		// 0～3までの乱数を生成し、int型を持つ変数fortuneに代入し、インクリメント演算子で1増やす
		int fortune = new Random().nextInt(4);
		fortune++;

		// 「占いの結果が出ました」と出力する
		System.out.println("占いの結果が出ました");

		// 結果を表示する
		System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");

		// 「1：大吉 2：中吉 3：吉 4：凶」と出力する
		System.out.println("1：大吉 2：中吉 3：吉 4：凶");
	}

}
