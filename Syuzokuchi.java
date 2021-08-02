/* 種族値計算ツール */

public class Syuzokuchi {
  
  public static void main(String[] args) {

    // ポケモンの名前を入力する
    System.out.println("ポケモンの名前を入力してください");
    String pokemon = new java.util.Scanner(System.in).nextLine();

    // HP種族値
    System.out.print("HPの種族値を入力してください > ");
    int hp = new java.util.Scanner(System.in).nextInt();

    // 攻撃種族値
    System.out.print("攻撃の種族値を入力してください > ");
    int a = new java.util.Scanner(System.in).nextInt();

    // 防御種族値
    System.out.print("防御の種族値を入力してください > ");
    int b = new java.util.Scanner(System.in).nextInt();

    // 特攻種族値
    System.out.print("特攻の種族値を入力してください > ");
    int c = new java.util.Scanner(System.in).nextInt();

    // 特防種族値
    System.out.print("特防の種族値を入力してください > ");
    int d = new java.util.Scanner(System.in).nextInt();

    // 素早さ種族値
    System.out.print("素早さの種族値を入力してください > ");
    int s = new java.util.Scanner(System.in).nextInt();

    // 合計種族値計算
    int total = hp + a + b + c + d + s;
    System.out.println("合計種族値は" + total + "です");
  }
}
