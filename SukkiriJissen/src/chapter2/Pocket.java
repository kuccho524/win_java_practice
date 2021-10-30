package chapter2;

public class Pocket<Pocket> {

	// フィールド
	private String data;

	// メソッド
	public void put(String d) {
		this.data = d;
	}

	public String get() {
		return this.data;
	}
}
