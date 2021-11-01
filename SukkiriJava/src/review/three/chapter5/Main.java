package review.three.chapter5;

public class Main {

	public static void main(String[] args) {
		// 各メソッドを呼び出す
		introduceOneself();
		email("飲み会", "example@example.com", "飲みに行こう");
		email("ads@example.com", "むーりー");
		System.out.println("三角形の面積は" + calcTriangleArea(5.0, 13.0) + "平方メートルです");
		System.out.println("円の面積は" + calcCircleArea(6.0) + "平方メートルです");

	}

	// introduceOneselfメソッドを定義する
	public static void introduceOneself() {
		String name = "Ryo";
		int age = 30;
		double height = 165.5;
		char zodiac = '未';

		// 自己紹介文を表示
		System.out.println("私の名前は" + name + "です。年齢は" + age + "歳、干支は" + zodiac + "で、身長は" + height + "です。");
	}

	// emailメソッドを定義する
	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}

	// emailメソッドをオーバーライドする
	public static void email(String address, String text) {
		String title = "無題";
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}

	// calcTriangleAreaメソッドを定義する
	public static double calcTriangleArea(double height, double bottom) {
		double triangleArea = height * bottom / 2;
		return triangleArea;
	}

	// calcCircleAreaメソッドを定義する
	public static double calcCircleArea(double radius) {
		final double PI = 3.14;
		double circleArea = radius * radius * PI;
		return circleArea;
	}

}
