package Chapter8;

import java.util.Random;

// 聖職者「Cleric」

public class Cleric {

	/*
	 * 各フィールドを宣言
	 * 最大HPと最大MPは定数フィールドで宣言する
	 */
	String name;
	int hp = 50;
	static final int maxHP = 50;
	int mp = 10;
	static final int maxMP = 10;

	// セルフエイドメソッドを定義
	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた");

		// mpを5減らす
		this.mp -= 5;

		// hpを最大まで回復させる
		this.hp = maxHP;

		System.out.println("HPが最大まで回復した");
	}

	// 祈るメソッド（祈る秒数を引数にする）
	public int prey(int sec) {
		System.out.println(this.name + "は" + sec + "祈った");

		// 理論上の回復量を乱数を用いて計算する
		int recover = new Random().nextInt(3) + sec;

		// 実際の回復量を計算する
		int recoverActual = Math.min(this.maxMP - this.mp, recover);

		// mpに反映させる
		this.mp += recoverActual;

		System.out.println("MPが" + recoverActual + "回復した");

		// 回復量を戻す
		return recoverActual;
	}
}
