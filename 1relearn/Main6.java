/* メールの内容をオーバーロードする */

public class Main6 {
  public static void main(String[] args) {

    // String型を持つ変数title、address、textに値を代入
    String address = "def@sample.com";
    String text = "嫌です";

    // emailメソッドを呼び出す
    email(address, text);
  }

  public static void email(String address, String text) {

    // オーバーロードする内容を出力
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名：Re: お誘い");
    System.out.println("本文：" + text);
  }

  public static void email(String title, String address, String text) {

    // 内容を出力する
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名：" + title);
    System.out.println("本文：" + text);
  }
}
