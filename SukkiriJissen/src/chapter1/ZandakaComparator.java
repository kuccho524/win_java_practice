package chapter1;

import java.util.Comparator;

public class ZandakaComparator implements Comparator<Account> {
	public int compare(Account x, Account y) {
		return (x.zandaka - y.zandaka);
	}

	/*
	 * Collections.sort()の２つの使い型
	 * 構文① 自然順序で並び替える
	 * Collections.sort(list);
	 *
	 * 構文② 残高順で並び替える
	 * Collections.sort(list, new ZandakaComparator());
	 */
}
