package review.one.chapter12;

public class Main {

	public static void main(String[] args) {

		/*
		 * Y y1 = new A(); Y y2 = new B();でインスタンス生成した後、
		 * y1.a(); y2.a();を実行する
		 */

		Y y1 = new A();
		Y y2 = new B();
		y1.a();
		y2.a();

		/*
		 * Y型の配列にAクラス、Bクラスのインスタンスを１つずつ格納し、
		 * それぞれをb()メソッドで呼び出す。
		 */

		// Y型の配列にAクラス、Bクラスのインスタンスを１つずつ格納
		Y[] arrays = new Y[2];
		arrays[0] = new A();
		arrays[1] = new B();

		// for文でそれぞれをb()メソッドで呼び出す。
		for (Y y : arrays) {
			y.b();
		}
	}

}
