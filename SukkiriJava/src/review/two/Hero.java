package review.two;

// Heroクラス

public class Hero {
	String name; // 名前の宣言
	int hp; // HPの宣言

	/*
	 * フィールドを用いるときはthisを付ける
	 * ※thisを省くと、同名の定数が優先されてしまい、予想外の動きをする
	 */

	public void attack() {};

	// 眠る
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した");
	};

	// 座る
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "座った");
	};

	// 転ぶ
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ");
		System.out.println("5のダメージ");
	};

	// 逃げる
	public void run() {
		System.out.println(this.name + "は、逃げ出した");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	};
}
