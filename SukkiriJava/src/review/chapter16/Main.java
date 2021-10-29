package review.chapter16;

// java.utilクラスをインポートする
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		/*
		 *  2人の勇者「斎藤」、「鈴木」をHeroとしてインスタンス化し、
		 *  それぞれをArrayListに格納して1人ずつ取り出す
		 */

		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");
		ArrayList<Hero> heros = new ArrayList<>();
		heros.add(h1);
		heros.add(h2);

		for (Hero h : heros) {
			System.out.println(h.getName());
		}

		/*
		 * それぞれの勇者が倒した数をペアでコレクションに格納する = Mapを使う
		 */

		Map<Hero, Integer> heros1 = new HashMap<Hero, Integer>();  // intではなく、Integerで指定する
		heros1.put(h1, 3);  // Mapで値を格納する場合は、putメソッドを使用する
		heros1.put(h2, 7);

		// 格納した値を取り出す
		for (Hero key : heros1.keySet()) {
			int value = heros1.get(key);  // Heroの持つnameをkeyにして、格納した数値を取り出す
			System.out.println(key.getName() + "の倒した数=" + value);
		}

		/*
		 * Mapの基本構文
		 * Map<型1, 型2> 変数名 = new HashMap<型1, 型2>();
		 *
		 * 格納した値を取り出す
		 * for (型1 key（変数１） : Mapに指定した変数名.keySet()) {
		 * 		型2 value 変数２ = Mapに指定した変数名.get(key)  ←get()メソッドを利用する
		 * 		処理内容
		 * 	]
		 */
	}

}
