package review.one.chapter9;

public class Matango {
	int hp;
	final int LEVEL = 10;
	char suffix;

	// コンストラクタを定義
	public Matango(char suffix) {
		this.suffix = suffix;
	}

	public void run() {
		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した");
	}
}
