public class Main5 {
  public static void main(String[] args) {
    
    // 画面に「[メニュー]1：検索 2：登録 3：削除 4：変更>」と表示する（改行しないこと）
    System.out.print("[メニュー]1：検索 2：登録 3：削除 4：変更>");

    // 数字を入力し、変数selectedに代入
    int selected = new java.util.Scanner(System.in).nextInt();

    // switch文で各数値で表示する内容を分岐し、いずれもない場合は何もしない
    switch(selected) {
      case 1:
        System.out.println("検索します");
        break;
      case 2:
        System.out.println("登録します");
        break;
      case 3:
        System.out.println("削除します");
        break;
      case 4:
        System.out.println("変更します");
        break;
      default:
        break;
    }
  }
}
