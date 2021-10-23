package Chapter8;

public class Main {
	public static void main(String[] args) {
		// Hero型(Heroクラス)をhと宣言し生成
		Hero h = new Hero(); // 生成時にnewメソッドを使う

		// 勇者を生み出す
		h.name = "ミナト";
		h.hp = 100;

		// お化けキノコを２匹生み出す
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';

		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';

		// 冒険の始まり
		h.slip();
		m1.run();
		m2.run();
		h.run();
	}
}
