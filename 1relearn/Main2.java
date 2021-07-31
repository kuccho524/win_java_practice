/* 数あてゲーム */

public class Main2 {
  public static void main(String[] args) {
    
    // 0～9の乱数を生成し、int型を持つ変数ansに格納
    int ans = new java.util.Random().nextInt(10);

    // 5回ループする。for文を作成
    for(int i = 0; i < 5; i++) {

      // 「0～9の数字を入力してください」と出力
      System.out.println("0～9の数字を入力してください");

      // 数字を入力し、変数numに格納
      int num = new java.util.Scanner(System.in).nextInt();

      // 変数numと変数ansの値が等しければ「アタリ！」と表示し繰り返しを終了する。違う場合、「違います」と表示
      if(num == ans) {
        System.out.println("アタリ！");
        break;
      } else {
        System.out.println("違います");
      }
    }

    // 「ゲームを終了します」と出力する
    System.out.println("ゲームを終了します");
  } 
}
