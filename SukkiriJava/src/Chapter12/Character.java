package Chapter12;

public abstract class Character {

	// フィールド
	String name;
	int hp;

	// メソッド
	public void run() {}
	public abstract void attack(Monster m);
}
