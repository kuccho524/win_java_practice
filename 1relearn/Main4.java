public class Main4 {
  public static void main(String[] args) {
    introduceOneself();
  }

  public static void introduceOneself() {

    // String型を持つ変数name、int型を持つ変数age、double型を持つ変数height、char型を持つ変数zodiacに値を代入
    String name = "Ryo";
    int age = 30;
    double height = 166.5;
    char zodiac = '未';

    // 自己紹介文を出力
    System.out.println(name + "です。" + age + "歳で、身長" + height + "cmの" + zodiac + "年生まれです。");
  }
}
