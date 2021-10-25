package Chapter11;

// 抽象メソッド含むクラスは、クラス宣言時にabstractを記述する

public abstract class Character {
	String name;
	int hp;

	// 逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}

	// 戦う
	// 詳細不明のメソッドは抽象メソッド（abstract）使用する
	public abstract void attack(Matango m);

	// 抽象クラスはnewによるインスタンス化が禁止される
}
