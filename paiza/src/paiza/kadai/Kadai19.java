package paiza.kadai;

// 敵に50～99ダメージ与えるプログラム

public class Kadai19 {
	public static void main(String[] args) {
		// double型を持つ変数randにランダムで50～99を格納する
		double rand = Math.random() * 50 + 50;

		// 変数randをint型にキャストし、int型を持つ変数numberに格納
		int number = (int)rand;

		// 「敵に○○のダメージを与えた」と表示
		System.out.println("敵に" + number + "のダメージを与えた");
	}
}
