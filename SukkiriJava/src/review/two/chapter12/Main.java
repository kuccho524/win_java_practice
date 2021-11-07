package review.two.chapter12;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		X obj = new A();
		obj.a();

		Y y1 = new A();
		Y y2 = new B();

		y1.a();
		y2.b();

		Y[] y = new Y[2];
		y[0] = new A();
		y[1] = new B();

		for (Y i : y) {
			i.b();
		}
	}

}
