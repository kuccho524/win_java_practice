package review.three.chapter10;

public class Matango {

	// フィールド
	int hp = 50;
	char suffix;

	// コンストラクタ
	public Matango(char suffix) {
		this.suffix = suffix;
	}

	public void attack(Hero h) {
		System.out.println("キノコ" + suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.hp -= 10;
	}
}
