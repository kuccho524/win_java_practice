package chapter3;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntPredicate;

public class Main {

	public static void main(String[] args) {
		// lenメソッドの処理ロジックを、変数funcに代入する
		Function<String, Integer> func = Main::len;

		// 変数funcに格納されている処理ロジックを、引数"Java"に実行する
		int a = func.apply("Java");
		System.out.println("文字列「Java」は" + a + "文字です");

		/*
		 * 変数へのメソッド参照
		 * 変数名 = クラス名::そのクラスの静的メソッド名
		 * 変数名 = インスタンス変数名:: そのインスタンスのメソッド名
		 */

		Function<String, Integer> func1 = (String s) -> { return s.length(); };
		int n = func.apply("Java");
		System.out.println("文字列「Java」は" + n + "文字です");

		/*
		 * ラムダ式
		 * (型 引数名1, 型 引数名2, ・・・) -> {
		 * 		処理;
		 * 		・・・・;
		 * 		return 戻り値;
		 * 	}
		 */

		/*
		 * ストリームの生成
		 *
		 * ・コレクションの場合
		 * Stream<T> st = コレクション<T>.stream();
		 *
		 * ・配列の場合
		 * Stream<T> st = Arrays.stream(T型の配列);
		 */

		/*
		 * Collect()によるリスト取り出し
		 * List<T> list = ストリーム.collect(Collectors.toList());
		 */

		FuncList funclist = new FuncList();
		IntPredicate f1 = x -> x % 2 == 1;
		Func3 f2 = (point, name) -> {
			return name + "さんは" + ( point > 65 ? "合格" : "不合格");
		};
		System.out.println(f1.test(15));
		System.out.println(f2.call(66, "Smith"));

		// フルネームが4文字以下の登場人物を表示する
		List<String> names = List.of("湊雄輔", "朝香あゆみ", "菅原拓真" , "大江岳人");
		names.stream().filter(m -> m.length() <= 4).map(m -> m + "さん").forEach(System.out::println);
	}

	public static int twice (int x) {
		return x * 2;
	}

	public static int sub(int a, int b) {
		return a - b;
	}

	public static Integer len(String s) {
		return s.length();
	}

}
