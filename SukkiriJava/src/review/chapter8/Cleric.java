package review.chapter8;

import java.util.Random;

// Clericクラス

public class Cleric {
	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;

	public void selfAid() {
		// セルフエイドを唱える
		System.out.println(this.name + "は、セルフエイドを唱えた");

		// mpを5減らす
		this.mp -= 5;

		// HPを最大にする
		this.hp = MAX_HP;
	}

	public int pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒間祈った");

		// int型を持つ変数recoverに理論上の回復量を乱数を用いて決定する
		int recover = new Random().nextInt(3) + sec;

		// 実際の回復量を計算し、int型を持つ変数recoverActualに格納
		int recoverActual = Math.min(MAX_MP - this.mp, recover);

		// mpを回復する
		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した");

		// recoverActualを戻す
		return recoverActual;
	}

	/*
	 * Math.min()メソッド
	 * 引数に指定した 2 つの値のうち、どちらか小さいほうの値を取得するには Math クラスで用意されている min メソッドを使用します。
	 * min メソッドはクラスメソッドです。引数のデータ型によって同じ名前のメソッドがいくつか用意されていますが、
	 * 例として int 型の値を引数に取るメソッドを確認します。
	 *
	 * nextInt()メソッド
	 * 数値を取得する
	 */
}
