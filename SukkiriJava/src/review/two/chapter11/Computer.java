package review.two.chapter11;

// TangibleAssetクラスを継承するComputerクラス

public class Computer extends TangibleAsset {

	// フィールド
	String makerName;

	// コンストラクタ
	public Computer(String name, int price, String color, String makerName) {
		super(name, price, color);
		this.makerName = makerName;
	}

	// メソッド
	public String getMakerName() {
		return this.makerName;
	}
}
