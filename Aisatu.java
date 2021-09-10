public class Aisatu {
  public static void main(String[] args) {

    // 「あなたの国の挨拶を入力してください」と出力する
    System.out.println("あなたの国の挨拶を入力してください");

    // String型を持つ変数greetingに入力された値を格納する
    String greeting = new java.util.Scanner(System.in).nextLine();

    // switch文で何語かを分岐する
    switch(greeting){
      case "こんにちは":
        System.out.println("日本語");
        break;
      case "Hello":
        System.out.println("English");
        break;
      default:
        System.out.println("分かりません");
    }
  }
}
