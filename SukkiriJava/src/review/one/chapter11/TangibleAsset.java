package review.one.chapter11;

public abstract class TangibleAsset extends Asset implements Weight {

	// フィールド
	String color;
	double weight;

	// コンストラクタ
	public TangibleAsset(String name, int price, String color) {
		super(name, price);
		this.color = color;
	}

	// メソッド
	public String getColor() {
		return this.color;
	}

	public double getWeight() {
		return this.weight;
	}

	public void setWegit(double weight) {
		this.weight = weight;
	}

	/*
	 * 抽象クラスは抽象メソッドと普通のメソッドを持つことができる
	 */
}
