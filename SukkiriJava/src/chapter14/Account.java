package chapter14;

public class Account {
	// フィールド
	String accountNumber;
	int balance;

	// 文字列表現のメソッド
	public String toString() {
		return "\\" + this.balance + "（口座番号：" +this.accountNumber + "）";
	}

	// 等価判定のメソッド
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o instanceof Account) {
			Account a = (Account) o;
			String ans1 = this.accountNumber.trim();
			String ans2 = a.accountNumber.trim();
			if (ans1.equals(ans2)) {
				return true;
			}
		}
		return false;
	}
}
