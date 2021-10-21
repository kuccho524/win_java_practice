package paiza.kadai;

// 1～6の数値をランダムに表示するサイコロ

public class Kadai20 {
	public static void main(String[] args) {
		// double型を持つ変数randに1～6の数値を格納
		double rand = Math.random() * 6 + 1;

		// 変数randをint型にキャストし、int型を持つ変数numberに格納
		int number = (int)rand;

		// 「サイコロの目は○○」と表示する
		System.out.println("サイコロの目は" + number);
	}
}
