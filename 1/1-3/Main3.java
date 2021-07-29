public class Main3 {
  public static void main(String[] args) {
    // int型の変数isHungryを定義し、0か1を代入
    int isHungry = 0;

    // string型の変数foodを定義し、食べ物を代入
    String food = "麺";

    // 「こんにちは」と出力
    System.out.println("こんにちは");

    // 変数isHungryであれば満腹、そうでなければ腹ペコ
    if(isHungry == 0) {
      System.out.println("お腹いっぱいです");
    } else {
      System.out.println("はらぺこです");
      // foodを頂く
      System.out.println(food + "をいただきます");
    }

    // 「ごちそうさまでした」と出力
    System.out.println("ごちそうさまでした");
  }
}
