package review.chapter10;

// PoisonMatangoクラス

public class PoisonMatango extends Matango {
	public PoisonMatango(char suffix) {
		super(suffix);
	}

	// 毒攻撃の回数の初期値を5で定義
	int poisonCount = 5;

	// attackメソッドを定義する
	public void attack(Hero h) {
		// 通常攻撃する
		super.attack(h);

		// 毒攻撃の回数が0以外の時に追加攻撃する
		if (poisonCount > 0) {
			System.out.println("さらに毒の胞子をばらまいた");
			int damage = h.hp / 5;
			h.hp = h.hp - damage;
			System.out.println(h.name + "に" + damage + "ポイントのダメージ");

			// 最後に毒攻撃の回数を1減らす
			poisonCount--;
		}
	}
}
