package Chapter13;

public class Wizard {

	// フィールド
	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	// メソッド
	public void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = (int)(basePoint * this.getWand().getPower());
		h.setUp(h.getUp() + recovPoint);
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した");
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		if (hp < 0) {
			this.hp = 0;
		} else {
			this.hp =hp;
		}
	}

	public int getMp() {
		return this.mp;
	}

	public void setMp(int mp) {
		if (mp < 0) {
			throw new IllegalArgumentException("設定されようとしているMPが以上です");
		}
		this.mp = mp;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {

		// 名前を3文字以上で指定する
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("魔法使いに設定されようとしている名前が以上です");
		}
		this.name = name;
	}

	public Wand getWand() {
		return this.wand;
	}

	public void setWand(Wand wand) {
		if (wand == null) {
			throw new IllegalArgumentException("設定されようとしている杖がnullです");
		}
		this.wand =wand;
	}

	// 処理内容は基本的にsetterに記述していく
}
