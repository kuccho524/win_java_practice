package review.chapter1;

import java.util.Comparator;

// Book型を持つComparatorを実装する
public class TitleCompare implements Comparator<Book> {

	// 書名を昇順で並び替える ⇒ compare()メソッドのオーバーライド
	// Book型を持つ変数xと、Book型を持つ変数yを引数に指定し、compare()メソッドをオーバーライド
	public int compare(Book x, Book y) {

		// xとyのタイトルを比較した結果を戻す
		return x.getTitle().compareTo(y.getTitle());

		/*
		 * compareは2つの値を比較する
		 */
	}

}
