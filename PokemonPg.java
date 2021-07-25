import java.util.Scanner;

public class PokemonPg {

  public static void main(String[] args) {

    // 導入文を出力する
    System.out.println("好きなポケモンを入力してください。");

    // Scannerクラスを宣言する
    Scanner stdIn = new Scanner(System.in);
    String pokemon = stdIn.nextLine();

    // 好きな1～4の数字を入力してもらう
    System.out.println("1～4の数字を入力してください。");
    int num = stdIn.nextInt();

    // 入力値によって出力する技を変化させる
    if(num > 0 && num < 5) {
      switch(num) {
        case 1:
          System.out.println(pokemon + "、「じわれ」だ！");
          break;
        case 2:
          System.out.println(pokemon + "、「つのドリル」だ！");
          break;
        case 3:
          System.out.println(pokemon + "、「ハサミギロチン」だ！");
          break;
        case 4:
          System.out.println(pokemon + "、「ぜったいれいど」だ！");
          break;
      }
    } else {
      System.out.println("ちゃんとやってくれよな！");
    }
  }

}