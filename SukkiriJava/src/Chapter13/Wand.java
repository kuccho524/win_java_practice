package Chapter13;

public class Wand {

	// フィールド
	private String name;
	private double power;

	public String getName() {
		return this.name;
	}

	public void getName(String name) {

		// 名前を3文字以上で指定する
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("杖に設定されようとしている名前が異常です");
		}
		this.name = name;
	}

	public double getPower() {
		return this.power;
	}

	public void setPoser(double power) {

		// 増幅率は、0.5以上100以下で指定する
		if (power >= 0.5 || power <= 100) {
			throw new IllegalArgumentException("杖に設定されようとしている魔力が異常です");
		}
		this.power = power;
	}

	// 処理内容は基本的にsetterに記述していく
}
