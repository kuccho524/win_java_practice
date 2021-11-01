package review.chapter2;


/*
 * 以下の従ったクラスを定義する
 * ①金庫クラスに格納するインスタンスの型は未定 ⇒ ジェネリクスを使用する
 * ②金庫には、１つにインスタンスを保存できる ⇒ コンストラクタがある
 * ③put()でインスタンスを保存し、get()でインスタンスを取得できる
 * ④get()で取得する際、キャストを使わなくても格納前の型に代入できる
 * ⑤鍵の種類を受け取るフィールドと鍵の種類を受け取るコンストラクタ（鍵の種類によって施行回数が変わる）
 * ⑥get()メソッドが呼び出されるたびに回数をカウントし、各鍵の施行回数に到達しない場合はnullを返す
 *
 * ～鍵の施行回数～
 * PADLOCK > 1024
 * BUTTON > 10000
 * DIAL > 30000
 * FINGER > 1000000
 */

// ジェネリクスを使用してクラス宣言をする ⇒ クラス名<E>を使用する
public class StrongBox<E> {

	// フィールド
	private E item;
	private KeyType keyType;
	private long count;


	// コンストラクタ
	public StrongBox(KeyType key) {
		this.keyType = key;
	}

	// メソッド
	public E get() {
		// countをインクリメントする
		this.count++;

		// switch文で条件分岐する
		switch(this.keyType) {
		case PADLOCK:
			if (count < 1024) return null;
			break;
		case BUTTON:
			if (count < 10000) return null;
			break;
		case DIAL:
			if (count < 30000) return null;
			break;
		case FINGER:
			if (count < 1000000) return null;
			break;
		}

		// get()メソッドが呼び出されるたびに回数をカウントするため、countを0にする
		this.count = 0;
		return this.item;
	}

	public void put(E item) {
		this.item = item;
	}

}
