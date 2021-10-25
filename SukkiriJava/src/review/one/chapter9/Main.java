package review.one.chapter9;

public class Main {
	public static void heal(int hp) {
		hp += 10;
	}

	public static void heal(Thief thief) {
		thief.hp += 10;
	}

	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		Hero h1 = new Hero("ミナト");
		h1.hp = 100;
		h1.sword = s;  // swordフィールドに生成済みの剣インスタンスを代入
		System.out.println("現在の武器は" + h1.sword.name);  // 変数hが持つsword.nameを出力するため、h.sword.nameとなる
		h1.attack();

		Hero h2 = new Hero();
		h2.hp = 100;

		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);

		Hero h3 = new Hero("ミナト");  // 引数にname指定
		System.out.println(h3.hp);
		System.out.println(h3.name);

		int baseHp = 25;
		Thief t = new Thief("アサカ", baseHp);
		System.out.println(baseHp + "：" + t.hp);
		heal(baseHp);
		heal(t);
		System.out.println(baseHp + "：" + t.hp);
	}
}
