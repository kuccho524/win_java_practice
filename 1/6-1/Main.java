/* 水戸黄門のセリフ */

import comment.Zenhan;

public class Main {
  public static void main(String[] args) throws Exception {

    // Zenhanクラスに分類するメソッド
    Zenhan.doWarusa();
    Zenhan.doTogame();

    // Kouhanクラスに分類するメソッド
    comment.Kouhan.callDeae();
    comment.Kouhan.showMondokoro();

    /* 呼び出し先で「throws Exception」がある場合、mainでも定義する */
  }
}
