package review.one.chapter10;

// Matangoクラスから継承してPoisonMatangoクラスを生成

public class PoisonMatango extends Matango {

	// コンストラクタを定義
	public PoisonMatango(char suffix) {
		super(suffix);
	}

	public void attack(Hero h) {
		// int型を持つ変数poisonCountを定義し、初期値に5を代入
		int poisonCount = 5;

		/*
		 * 通常攻撃を行い、poisonCountが0より多い場合、以下を行う
		 * ①毒の胞子をばらまく
		 * ②HeroにHPの1/5相当のダメージを与える
		 * ③毒攻撃の残り回数を1減らす
		 */

		// 通常攻撃を行う
		super.attack(h);

		// poisonCountが0より多いときの追加攻撃を行う
		if (poisonCount > 0) {

			// 毒の胞子をばらまく
			System.out.println("さらに毒の胞子をばらまいた");

			// HeroにHPの1/5相当のダメージを与える
			int damage = h.hp / 5;
			h.hp -= damage;
			System.out.println(damage + "ポイントのダメージ");

			// 毒攻撃の残り回数を1減らす
			poisonCount--;
		}
	}
}
