package progate.enshu;

/*
 * 配列に格納されている奇数、偶数それぞれの和を求める
 */

public class Enshu {
	public static void main(String[] args) {
		// int型の配列を持つ変数numbersを宣言し、値を格納
		int[] numbers = {1, 4, 6, 9, 13, 16};

		// int型を持つ変数oddSumを宣言し、0を格納
		int oddSum = 0;

		// int型を持つ変数evenSumを宣言し、0を格納
		int evenSum = 0;

		// for文を用いて配列内の各値を取得する
		for (int number : numbers) {
			// if文で奇数偶数を条件分岐
			if (number % 2 == 0) {
				evenSum += number;
			} else {
				oddSum += number;
			}
		}

		// 奇数の和を出力する
		System.out.println("奇数の和は" + oddSum + "です");

		// 偶数の和を出力する
		System.out.println("偶数の和は" + evenSum + "です");
	}
}
