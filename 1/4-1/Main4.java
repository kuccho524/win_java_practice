/* 数あてクイズ */

public class Main4 {
  public static void main(String[] args) {
    
    // int型の配列を持つ変数numbersに初期値として「3, 4, 9」を代入
    int[] numbers = { 3, 4, 9 };

    // 画面に「一桁の数字を入力してください」と表示
    System.out.println("一桁の数字を入力してください");

    // int型を持つ変数inputに標準入力
    int input = new java.util.Scanner(System.in).nextInt();

    // 配列をループで回しながらいずれかの要素と等しいか調べ、等しければ「アタリ！」と表示
    for (int value : numbers) {
      if(value == input) {
        System.out.println("アタリ！");
      }
    }
  }
}
