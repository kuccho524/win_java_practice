package review.chapter13;

// Wizardクラス

public class Wizard {

	// フィールド
	int hp;
	int mp;
	String name;
	Wand wand;

	void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = (int)(basePoint * this.getWand().getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した");
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		if (hp < 0) {
			this.hp = 0;
		} else {
			this.hp = hp;
		}
	}

	public int getMp() {
		return this.mp;
	}

	public void setMp(int mp) {

		// MPが0未満の時、例外をスローする
		if (mp < 0) {
			throw new IllegalArgumentException("魔法使いに設定されているMPに異常があります");
		}
		this.mp = mp;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {

		// 名前がnullもしくは3文字未満の時、例外をスローする
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("魔法使いに設定されている名前に異常があります");
		}
		this.name = name;
	}

	public Wand getWand() {
		return this.wand;
	}

	public void setWand(Wand wand) {

		// 杖を持っていない場合に例外をスローする
		if (wand == null) {
			throw new IllegalArgumentException("設定されようとしている杖がnullです");
		}
		this.wand = wand;
	}
}
