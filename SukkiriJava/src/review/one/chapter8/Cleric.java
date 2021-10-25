package review.one.chapter8;

import java.util.Random;

// 聖職者「Cleric」クラス

public class Cleric {

	/*
	 * フィールドに「名前」、「HP」、「最大HP」、「MP」、「最大MP」を追加する
	 * 「HP」、「最大HP」の初期値は50、「MP」、「最大MP」の初期値は10とし、
	 * 「最大HP」と「最大MP」は定数フィールドとして宣言する
	 */

	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;

	// セルフエイドメソッドを定義する
	public void selfAid() {

		// 「セルフエイドを唱えた」と出力する
		System.out.println(this.name + "はセルフエイドを唱えた");

		// MPを5消費する
		this.mp -= 5;

		// HPを最大まで回復する
		this.hp = MAX_HP;

		// 「HPが最大まで回復した」と表示する
		System.out.println("HPが最大まで回復した");
	}

	// 祈るメソッドを定義する。祈る秒数をとし、回復量を戻り値として返す
	public int pray(int sec) {

		// 祈る
		System.out.println(this.name + "は" + sec + "秒間祈った");

		// 理論上の回復量を乱数を用いて計算する
		int recover = new Random().nextInt(3) + sec;

		// 実際の回復量を計算する
		int recoverActual = Math.min(MAX_MP - this.mp, recover);

		// MPを回復させる
		this.mp += recoverActual;

		// 回復量を表示する
		System.out.println("MPが" + recoverActual + "回復した");

		// recoverActualを戻す
		return recoverActual;
	}
}
