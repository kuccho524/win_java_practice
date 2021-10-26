package Chapter13;


public class Hero {
	private String name;
	private int hp;
	Sword sword;

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

	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		System.out.println("お化けキノコから反撃を受けた");
		this.hp -= 2;
		if (this.hp <= 0) {
			this.die();
		}
	}

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
