package chapter14;


public class Hero {
	String name;
	int hp;
	static int money; // Heroクラスでmoneyを共有する
	// Sword sword;

	public void bye() {
		System.out.println("勇者は別れを告げた");
	}

	private void die() {
		System.out.println(this.name + "は死んでしまった");
		System.out.println("GAMEOVER");
	}

	void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は眠って回復した");
	}

	/*
	 * public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		System.out.println("お化けキノコから反撃を受けた");
		this.hp -= 2;
		if (this.hp <= 0) {
			this.die();
		}
	}
	 */

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("名前が短すぎる");
		}

		if (name.length() <= 1) {
			throw new IllegalArgumentException("名前が短すぎる。処理を中断");
		}

		if (name.length() >= 8) {
			throw new IllegalArgumentException("名前が長すぎる。処理を中断");
		}
		this.name = name;
	}

	public int getUp() {
		return this.hp;
	}

	public void setUp(int hp) {
		this.hp = hp;
	}

	public String toString() {
		return "名前：" + this.name + "/HP：" + this.hp;
	}

	// 等価判定
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o instanceof Hero) {
			Hero h = (Hero) o;
			if (this.name.equals(h.name)) {
				return true;
			}
		}

		return false;
	}

	// 所持金をランダムに設定する
	public static void setRandomMoney() {
		Hero.money = (int)(Math.random() * 1000);
	}

	/*
	 * メンバに関するアクセス修飾子の定石
	 * ・フィールドは全てprivate
	 * ・メソッドは全てpublic
	 */


	/*
	 * getterとsetter
	 *
	 * ・getterメソッドの定石
	 *
	 * 	public データ型 getフィールド名() {
	 * 		return this.フィールド名;
	 * 	}
	 *
	 * ・setterメソッドの定石
	 *
	 * 	public void setフィールド名(フィールド名 任意の変数名) {
	 * 		this.フィールド名 = 任意の変数名;
	 * 	}
	 */
}
