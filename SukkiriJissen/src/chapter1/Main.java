package chapter1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws Exception {
		// equals()メソッドで比較する
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {1, 2, 3, 4, 5};

		System.out.println("誤った判定" + a.equals(b));
		System.out.println("正しい判定" + Arrays.equals(a, b));  // 二次元以上の配列同士の等価判定には、Arrays.deepEquals()を用いる

		/*
		 * 書籍を３冊生成し、ArrayListに格納した上で書名順に表示する
		 */

		SimpleDateFormat f = new SimpleDateFormat("yyyy/mm/dd");
		ArrayList<Book> books = new ArrayList<>();

		/*
		 * 以下のデータを格納する
		 * title・・・Java入門
		 * publishDate・・・2011/10/07
		 * comment・・・スッキリわかる
		 */

		Book b1 = new Book();
		b1.setTitle("Java入門");
		b1.setPublishDate(f.parse("2011/10/07"));
		b1.setComment("スッキリわかる");
		books.add(b1);

		/*
		 * 以下のデータを格納する
		 * title・・・Python入門
		 * publishDate・・・2019/06/11
		 * comment・・・カレーが食べたくなる
		 */

		Book b2 = new Book();
		b2.setTitle("Python入門");
		b2.setPublishDate(f.parse("2019/06/11"));
		b2.setComment("カレーが食べたくなる");
		books.add(b2);

		/*
		 * 以下のデータを格納する
		 * title・・・C言語入門
		 * publishDate・・・2018/06/21
		 * comment・・・ポインタも自由自在
		 */


		Book b3 = new Book();
		b3.setTitle("C言語入門");
		b3.setPublishDate(f.parse("2018/06/21"));
		b3.setComment("ポインタも自由自在");
		books.add(b3);

		Collections.sort(books, new TitleComparator());

		for (Book c : books) {
			System.out.println(c.getTitle() + " " + f.format(c.getPublishDate()) + " " + c.getComment());
		}
	}

}
