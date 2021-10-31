package chapter5;

public class Bank {

	// フィールド
	String name;
	String address;

	/* EqualsBuilderを用いないBankクラス
	 *
	 * public boolean equals(Object o) {
		if (o == this) return true;
		if (o == null) return false;
		if(!(o instanceof Bank)) return false;
		Bank r = (Bank) o;
		if (!this.name.equals(r.name)) return false;
		if (!this.address.equals(r.address)) return false;
		return true;
	}
	 */

	// EqualsBuilderを用いたBankクラス
	public boolean equals(Object o) {
		return EqualsBuilder.reflectionEquals(this, o);
	}
}
