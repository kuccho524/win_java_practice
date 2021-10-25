package review.one.chapter9;

public class Hero {
	String name;
	int hp;
	Sword sword;  // 定義したSwordクラスからSword型フィールドを持つSwordを定義

	public void attack() {
		System.out.println(this.name + "は" + sword.name + "で攻撃した");  // Sword型のフィールドswordからnameを呼び出すため、sword.nameとしている
		System.out.println("敵に5ポイントのダメージをあたえた");
	}

	public void sleep() {
		this.hp = 100;  // thisを省略すると同名のローカル変数が優先されてしまうので、フィールドを用いるときはthisを使う
		System.out.println(this.name + "は眠って回復した");
	}
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は" + sec + "秒座った");
	}

	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ");
		System.out.println("5のダメージ");
	}

	public void run() {
		System.out.println(this.name + "は逃げ出した");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}

	// コンストラクタを定義（引数にnameを受け渡す）
	public Hero(String name) {
		this.hp = 100; // hpフィールドを100で初期化
		this.name = name; // 引数の値でnameフィールドを初期化
	}

	// 引数に何も受け渡しをしないコンストラクタを定義（オーバーロードをしている）
	public Hero() {
		this("ダミー");  // コンストラクタの先頭に記述する！！
	}
}
