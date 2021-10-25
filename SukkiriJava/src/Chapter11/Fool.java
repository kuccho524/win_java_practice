package Chapter11;

public class Fool extends Character implements Human {
	public void attack(Matango m) {
		System.out.println(this.name + "は戦わずに遊んでいる");

		// Humanから継承した各メソッドを継承する
		public void talk() {}
		public void watch() {}
		public void hear() {}
		public void run() {}
	}
}
