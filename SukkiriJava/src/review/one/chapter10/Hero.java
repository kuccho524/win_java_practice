package review.one.chapter10;

// Heroクラス

public class Hero {
	String name = "ミナト";
	int hp = 100;

	// 戦う
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		m.hp -= 5;
		System.out.println("5ポイントのダメージ");
	}

	// slip()はオーバーライドできない
	/*
	 * クラスにfinalを付けることで継承禁止
	 * メソッドにfinalを付けることでオーバーライド禁止
	 */
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ");
		System.out.println("5ポイントのダメージ");
	}

	// 逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}

	// Heroコンストラクタの動作確認
	public Hero() {
		System.out.println("Heroコンストラクタが動作");
	}
}
