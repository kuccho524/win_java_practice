/* mainメソッドからemailを呼び出し、オーバーライドする */

public class Main3 {
  public static void main(String[] args) {
    String address = "def@sample.com";
    String text = "お誘い";
    email(address, text);
  }

  // emailをオーバーライド
  public static void email(String address, String text) {
    System.out.println(address + "に以下のメールを送信しました");
    System.out.println("件名：無題");
    System.out.println("本文：" + text);
  }

  public static void email(String title, String address, String text) {
    System.out.println(address + "に以下のメールを送信しました");
    System.out.println("件名：" + title);
    System.out.println("本文：" + text);
  }
}
