package chapter4;

public class RefSample {

	// フィールド
	public int times = 0;

	// コンストラクタ
	public RefSample(int t) {
		this.times = t;
	}

	// メソッド
	public void hello(String msg) {
		this.hello(msg, this.times);
	}

	public void hello(String msg, int t) {
		System.out.println("Hello " + msg + " x" + t);
	}
}
