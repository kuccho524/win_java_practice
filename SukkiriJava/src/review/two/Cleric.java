package review.two;

// Clericクラス

public class Cleric {

	/*
	 * フィールドに以下を宣言する
	 * 「名前」、「HP」、「最大HP」、「MP」、「最大MP」
	 * 「最大HP」は50、「最大MP」は10で定数フィールドとして宣言する
	 */

	String name;
	int hp;
	final int MAX_HP = 50;  // 定数のため変数は大文字、初期値も設定する
	int mp;
	final int MAX_MP = 10;  // 定数のため変数は大文字、初期値も設定する

	// mpを5消費して、HPを最大まで回復するセルフエイドメソッドを定義する
	public void selfAid() {
		System.out.println(this.name + "は、セルフエイドを唱えた");
		this.mp -= 5;
		this.hp = MAX_HP;
		System.out.println("体力が全回復した");
	}

	/*
	 * mpを回復する、祈るメソッドを定義する
	 * 戻り値に回復量、祈った秒数を引数に取る
	 */
	public int pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒間祈った");

		// 理論上の回復量を求める
		int recover = new java.util.Random().nextInt(3) + sec;


		// 実際の回復量を求める
		int recoverActual = Math.min(MAX_MP - this.mp, recover);
		this.mp += recoverActual;
		System.out.println("MPが"+ recoverActual + "回復した");

		// 実際の回復量を戻す
		return recoverActual;
	}
}
