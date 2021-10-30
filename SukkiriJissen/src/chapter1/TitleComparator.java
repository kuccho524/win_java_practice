package chapter1;

import java.util.Comparator;

// 署名を昇順で並び替えるためのTitleComparatorクラス

public class TitleComparator implements Comparator<Book> {

	// compare()メソッドをオーバーライド
	public int compare(Book x, Book y) {
		return x.getTitle().compareTo(y.getTitle());
	}
}
