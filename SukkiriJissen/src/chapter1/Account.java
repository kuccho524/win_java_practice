package chapter1;

public class Account implements Comparable<Account> {

	// フィールド
	int number;
	int zandaka;

	// compareTo()メソッドをオーバーライド
	public int compareTo(Account obj) {
		if (this.number < obj.number) {
			return -1;
		}
		if (this.number > obj.number) {
			return 1;
		}
		return 0;
	}
}
