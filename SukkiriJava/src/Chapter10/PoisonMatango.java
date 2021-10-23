package Chapter10;

public class PoisonMatango extends Matango {
	// 毒攻撃
	int poisonCount = 5;

	public PoisonMatango(char suffix) {
		super(suffix);
	}

	public void attack(Hero h) {
		super.attack(h); // 引数にHero = hのhを指定する

		// poisonCountが0出ないとき毒攻撃を仕掛ける
		if (this.poisonCount > 0) {
			System.out.println("さらに銅の胞子をばらまいた");

			// int型を持つ変数damageにHeroに与えるダメージを計算し格納
			int damage = h.hp / 5;

			// ダメージを与える
			h.hp -= damage;
			System.out.println(damage + "ポイントのダメージを与えた");

			// 毒攻撃の回数を１減らす
			this.poisonCount--;
		}
	}
}
