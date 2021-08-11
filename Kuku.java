/**
 * 九九の計算をするプログラム
 */

public class Kuku {
  public static void main(String[] args) {

    // for文でかける数を宣言
    for(int i = 1; i < 10; i++) {

      // for文で掛けられる数を宣言
      for(int j =1; j < 10; j++) {

        // 答えを出力
        System.out.print(i * j + " ");
      }

      // 掛けられる数が9に達してから改行する
      System.out.println("");
    }
  }
}
