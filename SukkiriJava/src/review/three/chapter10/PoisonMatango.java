package review.three.chapter10;

/*
 * Matangoクラスを継承するPoisonMatangoクラス
 */

public class PoisonMatango extends Matango {

	// コンストラクタ
	public PoisonMatango(char suffix) {
		super(suffix);
	}

	// 毒攻撃の回数を初期値5で定義する
	int poisonCount = 5;

	// 親クラスと同様の攻撃と毒攻撃を行う
	public void attack(Hero h) {

		// 親クラスのattackを呼び出す
		super.attack(h);

		/*
		 *  毒攻撃の回数が0より大きい場合以下を実行する
		 *  ①「さらに胞子をばらまいた」と出力する
		 *  ②勇者のHPの1/5に相当するポイントを勇者のHPから引く
		 *  ③勇者に与えたダメージを表示
		 *  ④毒攻撃の残り回数を1減らす
		 */

		if (poisonCount > 0) {
			System.out.println("さらに胞子をばらまいた");
			int dmg = h.hp / 5;
			h.hp -= dmg;
			System.out.println(dmg + "ポイントのダメージ");
			poisonCount--;
		}
	}

}
