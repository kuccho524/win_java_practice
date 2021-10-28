package chapter16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


public class Main {
	public static void main(String[] args) {

		/*
		 * ArrayListの宣言
		 * ArrayList<インスタンスの型> 変数名 = new ArrayList<インスタンスの型>();
		 * ※右辺のインスタンスの型は省略可
		 */

		ArrayList<Integer> points = new ArrayList<Integer>();
		points.add(10);
		points.add(80);
		points.add(75);

		/*
		 * forを用いたリストの取り出し
		 *
		 * for (int i = 0; i < リスト変数.size(); i++) {
		 * 		リスト変数.get(i)で要素を読み書き
		 * }
		 *
		 * for (リスト要素の方 e : リスト変数) {
		 * 		eで要素を読み書き
		 * }
		 */
		for (int i : points) {
			System.out.println(i);
		}

		/*
		 * イテレータの取得
		 * Iterator<リスト要素の型> it = リスト変数.iterator();
		 *
		 * リスト要素の取り出し
		 * while(it.hasNext()) {
		 * 		リスト要素の型 e = it.next();
		 * 	要素eを用いた処理
		 * 	}
		 */

		ArrayList<String> names = new ArrayList<String>();
		names.add("湊");
		names.add("朝香");
		names.add("菅原");

		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String e = it.next();
			System.out.println(e);
		}

		Set<String> colors = new HashSet<String>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		colors.add("赤");
		System.out.println("色は" + colors.size() + "種類");

		for (String s : colors) {
			System.out.print(s + "⇒");
		}

		Set<String> words = new TreeSet<String>();
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("panda");

		for (String s : words) {
			System.out.print(s + "⇒");
		}

		/*
		 * LinkedHashSet：値を格納した順序に整列
		 * TreeSet：自然順序付けで整列
		 */

		/*
		 * HashMapのインスタンス化
		 * Map<キーの型, 値の型> マップ変数 = new HashMap<キーの型, 値の型>():
		 *
		 * 追加・・・put
		 * 取得・・・get
		 * 削除・・・remove
		 * 全削除・・・clear
		 * ペア数の取得・・・size
		 */

		Map<String, Integer> prefs = new HashMap<String, Integer>();
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 181);

		int tokyo = prefs.get("東京都");
		System.out.println("東京都の人口は" + tokyo);

		prefs.remove("京都府");

		prefs.put("熊本県", 182);
		int kumamoto = prefs.get("熊本県");
		System.out.println("熊本県の人口は" + kumamoto);

		/*
		 * マップに格納された情報を１つずつ取り出す
		 * for (キーの型 key : マップ変数.keySet()) {
		 * 		値の型 value = マップ変数.get(key);
		 * 	keyとvalueを用いて何らかの処理をする
		 * 	}
		 */

		for (String key : prefs.keySet()) {
			int value = prefs.get(key);
			System.out.println(key + "の人口は" + value);
		}

		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");
		ArrayList<Hero> heros = new ArrayList<>();
		heros.add(h1);
		heros.add(h2);
		for(Hero e : heros) {
			System.out.println(e.getName());
		}

		Map<Hero, Integer> heros1 = new HashMap<Hero, Integer>();
		heros1.put(h1, 3);
		heros1.put(h2, 7);

		// heros1に格納されている情報を１つずつ取り出す

		// keyとvalueを用いて取り出す
		for (Hero key : heros1.keySet()) {
			int value = heros1.get(key);
			System.out.println(key.getName() + "が倒した数=" + value);
		}
		/*
		int enemies1 = heros1.get(h1);
		int enemies2 = heros1.get(h2);
		System.out.println("斎藤が倒した敵の数=" + enemies1);
		System.out.println("鈴木が倒した敵の数=" + enemies2);
		*/
	}

	public static void printList(ArrayList<String> list) {
		for (String s : list) {
			System.out.println(s);
		}
	}
}
