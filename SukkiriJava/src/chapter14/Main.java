package chapter14;

public class Main {

	public static void main(String[] args) {
		Object o1 = new Empty();
		Object o2 = new Hero();
		Object o3 = "こんにちは";

		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp = 100;
		Hero h2 = new Hero();
		h2.name = "ミナト";
		h2.hp = 100;

		if (h1.equals(h2) == true) {
			System.out.println("同じ内容です");
		} else {
			System.out.println("違う内容です");
		}

		Hero.setRandomMoney();
		System.out.println(Hero.money);
		Hero h3 = new Hero();
		System.out.println(h3.money);
	}

	public void printAnything(Object o) {
		System.out.println(o.toString());
	}

}
