/* mainメソッドからemailを呼び出す */

public class Main2 {
  public static void main(String[] args) {
    String title = "メールのタイトル";
    String address = "abc@sample.com";
    String text = "お疲れ様です";
    email(title, address, text);
  }

  public static void email(String title, String address, String text) {
    System.out.println(address + "に以下のメールを送信しました");
    System.out.println("件名：" + title);
    System.out.println("本文：" + text);
  }
}
