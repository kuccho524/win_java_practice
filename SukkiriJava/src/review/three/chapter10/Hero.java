package review.three.chapter10;

public class Hero {
	String name = "ミナト";
	int hp = 100;

	/*
	 * フィールドを用いるときはthisを付ける
	 * ※thisを省くと、同名の定数が優先されてしまい、予想外の動きをする
	 */

	// 攻撃
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		m.hp -= 5;
		System.out.println("5ポイントのダメージを与えた");
	};

	// 逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	};

	// オーバーライドできないslipメソッド
	// finalを付けることで継承できないメソッドになる
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ");
		System.out.println("5のダメージ");
	}

	// 動作確認
	public Hero() {
		System.out.println("Heroのコンストラクタが動作");
	}
}
