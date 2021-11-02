package review.three.chapter9;

/*
 * Thiefクラス
 */

public class Thief {

	// フィールド
	String name;
	int hp;
	int mp;


	// インスタンスを生成したときにname, hp, mpを指定してインスタン化できるようコンストラクタを作成する
	public Thief(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

	/*
	 *  インスタンスを生成したときにname, hpを指定してインスタンス化できるようコンストラクタを作成する
	 *  mpは5初期する
	 */

	public Thief(String name, int hp) {
		this(name, hp, 5);
	}

	/*
	 * インスタンスを生成したときにnameを指定してインスタンス化できるようコンストラクタを作成する
	 * hpは40、mpは5初期する
	 */

	public Thief(String name) {
		this(name, 40, 5);
	}
}
