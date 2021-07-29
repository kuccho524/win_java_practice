/* 数あてゲーム */

public class Main6 {
  public static void main(String[] args) {

    // 画面に「数あてゲーム」と出力
    System.out.println("【数あてゲーム】");

    // 0 ～ 9までの整数の中からランダムな数を1つ生成して、変数ansに代入
    int ans = new java.util.Random().nextInt(10);

    // for文を用いて5回繰り返すループを作る
    for(int i = 0; i < 5; i++) {

      // 画面に「0～9の数字を入力してください」と出力
      System.out.println("0～9の数字を入力してください");

      // int型を持つ変数numに標準入力
      int num = new java.util.Scanner(System.in).nextInt();

      // 変数intが変数numと等しかったら「アタリ！」と表示して繰り返しを終了し、違う場合は「違います」と出力
      if(num == ans) {
        System.out.println("アタリ！");
        break;
      } else {
        System.out.println("違います。");
      }
    }

    // 「ゲームを終了します」と出力
    System.out.println("ゲームを終了します");
  }
}
