package Chapter12;

public class Main {
	public static void main(String[] args) {
		Wizard w = new Wizard();
		w.name = "アサカ";


		Slime s = new Slime();
		Monster ms = new Slime();
		s.run();
		ms.run();

		Hero h1 = new Hero();
		Hero h2 = new Hero();
		Wizard w1 = new Wizard();
		Wizard w2  = new Wizard();
		Thief t1 = new Thief();

		h1.hp += 50;
		h2.hp += 50;
		t1.hp += 50;
		w1.hp += 50;
		w2.hp += 50;

		Character[] c = new Character[5];
		c[0] = new Hero();
		c[1] = new Hero();
		c[2] = new Hero();
		c[3] = new Wizard();
		c[4] = new Wizard();

		for (Character ch : c) {
			ch.hp += 50;
		}

		Y[] array = new Y[2];
		array[0] = new A();
		array[1] = new B();
		for (Y y : array) {
			y.b();
		}
	}
}
