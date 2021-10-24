package review.chapter9;

// Thiefクラス

public class Thief {
	String name;
	int hp;
	int mp;

	// 名前、hp、mpを指定してインスタンス化できるようにする
	public Thief(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

	// 名前とhpだけを指定してインスタンス化できるようにし、mpは初期値に5を格納する
	public Thief(String name, int hp) {
		this(name, hp, 5);
	}

	// 名前だけを指定してインスタンス化できるようにする、hpは40、mpが5を初期値とする
	public Thief(String name) {
		this(name, 40, 5);
	}
}
