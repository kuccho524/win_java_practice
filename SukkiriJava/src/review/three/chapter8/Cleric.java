package review.three.chapter8;

import java.util.Random;

/*
 * 聖職者「Cleric」クラス
 */

public class Cleric {

	/*
	 * フィールドに以下を宣言する
	 * 「名前」、「HP」、「最大HP」、「MP」、「最大MP」
	 * 「最大HP」と「最大MP」はそれぞれ50, 10の定数で初期化する
	 */

	String name;
	int hp = 50;;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;

	/*
	 * MPを5消費する代わりにHPを最大にするセルフエイドメソッドを定義する
	 * 引数、戻り値は共になし
	 */

	public void selAid() {
		System.out.println(this.name + "はセルフエイドを使った");

		// mpを5消費する
		this.mp -= 5;

		// 体力を最大まで回復する
		this.hp = MAX_HP;

		System.out.println("HPが最大まで回復した");
	}

	/*
	 * MPを回復する祈るメソッドを定義する
	 * 祈った秒数によって回復量が変わる
	 * 引数に祈った秒数、戻り値にint型を取る
	 */

	public int pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒間祈った");

		// 理論上の回復量を計算する
		int recover = new Random().nextInt(3) + sec;

		// 実際の回復量を求める
		int recoverActual = Math.min(MAX_MP - this.mp, recover);
		this.mp += recoverActual;

		System.out.println("MPが" + recoverActual + "回復した");

		// 実際の回復量を戻す
		return recoverActual;
	}
}
