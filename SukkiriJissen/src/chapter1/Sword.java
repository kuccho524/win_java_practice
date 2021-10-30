package chapter1;

public class Sword implements Cloneable {

	// フィールド
	private String name;

	// clone()メソッドをオーバーライド
	public Sword clone() {
		Sword result = new Sword();
		result.name = this.name;
		return result;
	}
}
