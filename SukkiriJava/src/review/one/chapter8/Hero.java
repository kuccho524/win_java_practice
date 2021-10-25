package review.one.chapter8;

public class Hero {
	String name;
	int hp;

	public void attack() {

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

	// オブジェクト指向基づいて作るメソッドには、staticを付けない
}
