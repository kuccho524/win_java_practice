package review.three.chapter6.comment;

public class Kouhan {

	// callDeaeメソッドを定義する
	public static void callDeae() {
		System.out.println("えぇい、こしゃくな。くせ者だ！であぇい！");
	}

	// showMondokoroメソッドを定義する
	public static void showMondokoro() throws Exception {
		System.out.println("飛車さん、角さん。もういいでしょう");
		System.out.println("この紋所が目に入らぬか");
		Thread.sleep(3000);  // ミリ秒が引数になるため、3秒の場合は3000と入力する
		Zenhan.doTogame();
	}
}
