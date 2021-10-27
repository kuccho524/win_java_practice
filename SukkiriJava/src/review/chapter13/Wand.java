package review.chapter13;

// Wnadクラス

public class Wand {

	// フィールド
	private String name;
	private double power;

	// メソッド
	public String getName() {
		return this.name;
	}

	public void setName(String name) {

		// 名前がnullもしくは3文字未満の時、例外をスローする
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("杖に設定されている名前に異常があります");
		}
		this.name = name;
	}

	public double getPower() {
		return this.power;
	}

	public void setPower(double power) {

		// 杖のパワーが0.5未満、もしくは100より大きい時、例外をスローする
		if (power < 0.5 || power > 100.0) {
			throw new IllegalArgumentException("杖に設定されているパワーに異常があります");
		}
		this.power = power;
	}

}
