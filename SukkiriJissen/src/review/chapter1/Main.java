package review.chapter1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;

import chapter1.TitleComparator;


/*
 * 以下のリストをArrayListに格納した上で書名順に表示する
 * ①Java入門、2011/10/07、スッキリわかる
 * ②Python入門、2019/06/11、カレーが食べたくなる
 * ③C言語入門、2018/06/21、ポインタも自由自在
 */

public class Main {

	public static void main(String[] args) throws Exception {

		// SimpleDateFormat型を持つ変数fにSimpleDateFormatインスタンスを生成し代入
		SimpleDateFormat f = new SimpleDateFormat("yyyy/mm/dd");

		// Book型を持つArrayListのbooksにArrayListインスタンスを生成し代入
		ArrayList<Book> books = new ArrayList<>();

		// Book型を持つ変数b1を生成し①を代入する
		Book b1 = new Book();
		b1.setTitle("Java入門");
		b1.setPublishDate(f.parse("2011/10/07"));  // parse()メソッドで文字列をDate型に変換する(Exceptionをスローする)
		b1.setComment("スッキリわかる");

		// ArrayListにb1を追加する
		books.add(b1);

		// Book型を持つ変数b2を生成し②を代入する
		Book b2 = new Book();
		b2.setTitle("Python入門");
		b2.setPublishDate(f.parse("2019/06/11"));
		b2.setComment("カレーが食べたくなる");

		// ArrayListにb2を追加する
		books.add(b2);

		// Book型を持つ変数b3を生成し③を代入する
		Book b3 = new Book();
		b3.setTitle("C言語入門");
		b3.setPublishDate(f.parse("2018/06/21"));
		b3.setComment("ポインタも自由自在");

		// ArrayListにb3を追加する
		books.add(b3);

		// 引数にbooksとTitleComparatorを指定するCollections.sort()メソッド
		Collections.sort(books, new TitleComparator());

		/*
		 * Collectionsクラスのsortメソッドは、リストの要素を自然順序付けの昇順でソートします。
		 */

		// for文で各値を取り出す
		for (Book b : books) {
			System.out.println(b.getTitle() + " " + f.format(b.getPublishDate()) + " " + b.getComment());
		}

		/*
		 * SimpleDateFormatは日付時刻を操作する
		 */
	}

}
