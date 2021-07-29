/*
* 占い館のプログラム
*/

public class Main2 {
  public static void main(String[] args) {

    // 「ようこそ占いの館へ」と出力
    System.out.println("ようこそ占いの館へ");

    // 「あなたの名前を入力してください」と出力し、文字列の標準入力を受け付ける
    System.out.println("あなたの名前を入力してください");
    String name = new java.util.Scanner(System.in).nextLine();

    /* 「あなたの年齢を入力してください」と出力し、String型の変数ageStringに標準入力を受け付け、内容を変換し、int型の変数ageに格納
     */
    System.out.println("あなたの年齢を入力してください");
    String ageString = new java.util.Scanner(System.in).nextLine();
    int age = Integer.parseInt(ageString);

    // 0～3までの乱数を生成し、int型の変数fortuneに代入
    int fortune = new java.util.Random().nextInt(4);

    // 変数fortuneをインクリメント演算子で1増やす
    fortune++;

    // 画面に「占いの結果が出ました！」と出力
    System.out.println("占いの結果が出ました！");

    // 画面に結果を表示する
    System.out.println(age + "歳の" +name + "さん、あなたの運気番号は" + fortune + "です");

    // 画面に「1：大吉 2：中吉 3：吉 4：凶」と出力
    System.out.println("1：大吉 2：中吉 3：吉 4：凶");
  }
}
