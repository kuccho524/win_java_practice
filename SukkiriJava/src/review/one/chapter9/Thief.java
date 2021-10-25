package review.one.chapter9;

// Thiefクラス

public class Thief {

	// フィールドにname, hp, mpを定義する
	String name;
	int hp;
	int mp;

	// new Thief("name", hp, mp)を指定して生成できるコンストラクタを定義
	public Thief(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

	// new Thief("name", hp)を指定して生成できるコンストラクタを定義し、mpは5で初期化する
	public Thief(String name, int hp) {
		this(name, hp, 5);
	}

	// new Thief("name")を指定して生成できるコンストラクタを定義し、hpは40、mpは5で初期化する
	public Thief(String name) {
		this(name, 40, 5);
	}
}
