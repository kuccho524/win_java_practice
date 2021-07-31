/* 占いの館 */

public class Main1 {

  public static void main(String[] args) {

    // 「ようこそ占いの館へ」と出力
    System.out.println("ようこそ占いの館へ");

    // 「あなたの名前を入力してください」と出力し、String型を持つ変数nameに標準入力を受け付ける
    System.out.println("あなたの名前を入力してください");
    String name = new java.util.Scanner(System.in).nextLine();

    // 「あなたの年齢を入力してください」と出力し、String型を持つ変数ageStringに標準入力を受け付ける
    System.out.println("あなたの年齢を入力してください");
    String ageString = new java.util.Scanner(System.in).nextLine();

    // 変数ageStringの内容を、int型を持つの変数ageに格納する
    int age = Integer.parseInt(ageString);

    // 0～3までの乱数を生成し、int型を持つ変数fortuneに格納し、インクリメント演算子で1増やす
    int fortune = new java.util.Random().nextInt(4);
    fortune++;

    // 「占いの結果が出ました」と出力し、結果を表示する
    System.out.println("占いの結果が出ました");
    System.out.println(age+ "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
    System.out.println("1：大吉 2：中吉 3：吉 4：凶");
  }
}