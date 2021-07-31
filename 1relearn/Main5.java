/* メールの内容 */

public class Main5 {
  public static void main(String[] args) {

    // String型を持つ変数title、address、textに値を代入
    String title = "お誘い";
    String address = "abc@sample.com";
    String text = "飲みに行こうぜ！";

    // emailメソッドを呼び出す
    email(title, address, text);
  }

  public static void email(String title, String address, String text) {

    // 内容を出力する
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名：" + title);
    System.out.println("本文：" + text);
  }
}
