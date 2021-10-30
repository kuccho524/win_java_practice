package chapter2;

public class StrongBox<E> {

	// フィールド
	private Key key;
	private E item;
	private long count;

	// コンストラクタ
	public StrongBox(Key key) {
		this.key = key;
	}

	// メソッド
	public void put(E i) {
		this.item = i;
	}

	public E get() {
		this.count++;


		/*
		 * 鍵の種類を示すフィールドと、
		 * 鍵の種類を受け取るコンストラクタを定義し、
		 * 各鍵の種類によって条件分岐。
		 * また、要施工回数に到達しない限りnullを返す
		 */
		switch(this.key) {
		case PADLOCK:
			if (count < 1024) return null;
			break;
		case BUTTON:
			if(count < 10000) return null;
			break;
		case DIAL:
			if (count < 30000) return null;
			break;
		case FINGER:
			if (count < 1000000) return null;
			break;
		}
		this.count = 0;
		return this.item;
	}


}
