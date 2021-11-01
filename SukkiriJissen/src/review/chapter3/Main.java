package review.chapter3;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// FuncList型を持つ変数funclistに生成したインスタンスを格納
		FuncList funclist = new FuncList();

		// Func1型を持つ変数f1にisOddメソッドを呼び出す
		Func1 f1 = FuncList::isOdd;

		// Func2型を持つ変数f2にpassCheckメソッドを呼び出す
		Func2 f2 = funclist::passCheck;

		// f1でcallメソッドの値を呼び出す
		System.out.println(f1.call(15));

		// f2でcallメソッドを呼び出す
		System.out.println(f2.call(66, "Smith"));


		/*
		 * 上記をラムダ式を使って記述する
		 */

		// func1型を持つ変数f3に奇数であることを明示する（isOddメソッドの記述をする）
		Func1 f3 = x -> x % 2 == 1;

		// func2型を持つ変数f4に三項演算子を記述（passCheckメソッドを記述する）
		Func2 f4 = (point, name) -> {
			return name + "さんは" + (point > 65 ? "合格" : "不合格");
		};

		// f3でcallメソッドの値を呼び出す
		System.out.println(f3.call(15));

		// f4でcallメソッドを呼び出す
		System.out.println(f4.call(66, "Smith"));


		/*
		 * 上記を標準関数インタフェースに変更する
		 */

		Func1 f5 = x -> x % 2 ==1;
		Func2 f6 = (point, name) -> {
			return name + "さんは" + (point > 65 ? "合格" : "不合格");
		};

		System.out.println(f5.test(15));
		System.out.println(f6.call(66, "smith"));


		/*
		 * 「湊雄輔」、「朝香あゆみ」、「菅原拓真」、「大江岳人」の４名の中から、
		 * フルネームが４文字以下である全ての人物を取り出す
		 */

		List<String> names = List.of("湊雄輔", "朝香あゆみ", "菅原拓真", "大江岳人");  // List<データ型>とList.of()メソッドを使用する
		names.stream().filter(n -> n.length() <= 4).map(n -> n + "さん").forEach(System.out::println);;  // 変数.stream().filter(条件)で条件を指定できる

		/*
		 * List<T>クラス
		 * インデックスを使用してアクセスできる、厳密に型指定されたオブジェクトのリストを表す。
		 * リストの検索、並べ替え、および操作のためのメソッドを提供する。
		 *
		 *
		 * List.Of()メソッド
		 * List.of()メソッドは簡単に変更が不可能(immutable)なリストを作成することができる。
		 * ・nullは許容しない
		 * ・immutable（不変）
		 * ・リスト内の要素の順序は、引数の順序、または指定された配列内の要素の順序と同じ ⇒ 並び替えは不可
		 * ・value-based（値ベース）
		 */

	}

}
