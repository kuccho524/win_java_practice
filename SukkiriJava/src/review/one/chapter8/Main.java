package review.one.chapter8;

public class Main {
	public static void main(String[] args) {

		// 1,Heroクラスから勇者を生成
		Hero h = new Hero();  // クラスを生成すると型として利用でき、newメソッドで生成する

		// 2,フィールドに初期値をセット
		h.name = "ミナト";  // 「変数名.フィールド名 = 値」でフィールド地への代入が可能
		h.hp = 100;
		System.out.println("勇者" + h.name + "を生み出しました");

		// 3,お化けキノコを2匹生み出す
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';

		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';

		// 4,冒険の始まり
		h.sit(5);  // Heroクラスのsitメソッドにint型の引数があるため、()に数値を入力している
		h.slip();
		m1.run();
		m2.run();
		h.run();
	}
}
