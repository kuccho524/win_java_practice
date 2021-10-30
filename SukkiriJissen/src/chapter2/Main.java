package chapter2;

import java.util.Optional;

public class Main {

	/*
	 * ジェネリクスメソッド
	 * アクセス修飾子 static <T> 戻り値 メソッド名(引数リスト) {
	 * 		メソッドの処理内容
	 * 	}
	 */

	public static void prints(Object a, Object b) {
		for (int i = 0; i < (Integer) b; i++) {
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		Object s = "こんにちは";
		s = new Hero();
		Object n = 1;
		prints(s, n);

		Pocket<String> p = new Pocket<>();
		p.put("1192");
		String t = p.get();
		System.out.println(t);

		/*
		 * ・ジェネリクスの型にintなどの基本データ型は利用できない
		 * ・ジェネリクスを用いたクラスの配列を作ることができない
		 * ・Throwableの子孫であるクラス（例外クラス）では、ジェネリクスを用いることはできない
		 */

		// メンバクラスInnerを呼び出す
		Outer.Inner ic = new Outer.Inner();

		Pocket<Object> pocket = new Pocket<>();
		System.out.println("使い捨てのインスタンスを作りpocketに入れます");

		// 匿名クラス
		pocket.put(new Object() {
			String innerField;
			void innerMethod() {

			}
		});

		/*
		 * 匿名クラスの宣言兼利用
		 * new 匿名クラスの親クラス指定() {
		 * 		匿名クラスの内容（メンバ）定義
		 * 	}
		 */

		Optional<String> st = decorate("", '*');
		System.out.println(st.orElse("nullのため処理できません"));
	}

	public static Optional<String> decorate(String s, char c) {
		String r;
		if (s == null || s.length() == 0) {
			r = null;
		} else {
			r = c + s + c;
		}
		return Optional.ofNullable(r);
	}
}
