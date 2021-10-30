package chapter1;

import java.util.Objects;

public class Hero implements Cloneable {

	// フィールド
	private String name;
	private int hp, mp;
	Sword sword;

	// toString()メソッドをオーバーライド
	public String toString() {
		return "勇者（名前=" + this.name + "/HP=" + this.hp + "/MP=" + this.mp + "）";
	}

	// hashCode()メソッドをオーバーライド
	public int hashCode() {
		return Objects.hash(this.name, this.hp);
	}

	// clone()メソッドをオ－バーライド
	public Hero clone() {
		Hero result = new Hero();
		result.name = this.name;
		result.hp = this.hp;
		result.sword = this.sword.clone();
		return result;
	}
}
