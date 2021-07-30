/* mainメソッドから呼び出して自己紹介を表示する */

public class Main1 {
  public static void main(String[] args) {
    introduceOneself();
  }

  public static void introduceOneself() {
    String name = "てつや";
    int age = 40;
    double height = 176.2;
    char zodiac = '巳';

    System.out.println(name + "、" + age + "歳、身長" + height + "cm、" + zodiac + "年生まれです。");
  }
}
