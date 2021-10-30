package chapter2;

public class Outer {

	// フィールド
	int outerField;
	int outerMember = 2;
	static int outerStaticField;

	// メンバクラス
	static class Inner {
		void innerMethod() {
			outerStaticField = 10;
		}
	}

	// メソッド
	void outerMethod() {
		int a = 10;

		// ローカルクラス
		class Inner {

			// メソッド
			public void innerMethod() {
				System.out.println("innerMethodです");
				System.out.println(outerMember + a);
			}
		}
		Inner ic = new Inner();
		ic.innerMethod();
	}
}
