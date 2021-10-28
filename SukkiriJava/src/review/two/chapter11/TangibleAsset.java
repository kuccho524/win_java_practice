package review.two.chapter11;

// Assetクラスを継承し、Thingインタフェースを実装する抽象クラスTangibleAsset

public abstract class TangibleAsset extends Asset implements Thing {

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

	public void setWegiht(double weight) {
		this.weight = weight;
	}
}
