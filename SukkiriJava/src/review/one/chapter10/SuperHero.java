package review.one.chapter10;

// SuperHeroクラス
// extendsを利用してHeroクラスから継承する

public class SuperHero extends Hero {
	boolean flying;

	// 戦う
	public void attack(Matango m) {
		// 親クラスのattack()メソッドを呼び出す
		super.attack(m);  // superで親クラスを呼び出し、super.メソッド名で親クラスのメソッドを呼び出す
		if (this.flying) {
			System.out.println(this.name + "の攻撃");
			m.hp -= 5;
			System.out.println("5ポイントのダメージ");
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

	// 逃げる
	public void run() {
		System.out.println(this.name+ "は撤退した");
	}

	// SuperHeroコンストラクタの動作確認
	public SuperHero() {
		System.out.println("SuperHeroコンストラクタが動作");
	}
}
