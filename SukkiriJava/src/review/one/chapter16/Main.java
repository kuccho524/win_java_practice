package review.one.chapter16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// 勇者「鈴木」、「斎藤」をHeroとしてインスタンス化し、ArrayListに格納して１人ずつ取り出す
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");

		ArrayList<Hero> heroes = new ArrayList<>();
		heroes.add(h1);
		heroes.add(h2);
		for (Hero hero : heroes) {
			System.out.println(hero.getName());
		}


		// 勇者それぞれの倒した数とペアで表示する
		Map <Hero, Integer> heros = new HashMap<Hero, Integer>();
		heros.put(h1, 3);
		heros.put(h2, 7);

		for(Hero key : heros.keySet()) {
			int value = heros.get(key);
			System.out.println(key.getName() + "が倒した数=" + value);
		}

		/*
		 * Mapで格納された配列をkeySet()メソッドを使用してfor文を回し、
		 * keyから対応するvalueを取り出す
		 */
	}

}
