package Chapter10;

// Heroクラスを継承してSuperHeroクラスを作成する

public class SuperHero extends Hero {
	boolean flying;

	/*
	 * フィールドを用いるときはthisを付ける
	 * ※thisを省くと、同名の定数が優先されてしまい、予想外の動きをする
	 */

	// attackメソッドをオーバーライド
	public void attack(Matango m) {
		// 親クラス(Heroクラス)からattackメソッドを呼び出す
		// superは「一つ内側のインスタンスの部分」を表す = １段階親のクラス
		super.attack(m);
		if (this.flying) {
			super.attack(m);
		}
	}

	// 飛ぶ
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった");
	}

	// 着地する
	public void land() {
		this.flying = false;
		System.out.println("着地した");
	}

	// 撤退する
	public void run() {
		System.out.println(this.name + "は撤退した");
	}

	public SuperHero() {
		System.out.println("SuperHeroのコンストラクタが動作");
	}

	/*
	 * クラスの定義にextendsを利用し、差分のメソッドを定義する
	 */
}
