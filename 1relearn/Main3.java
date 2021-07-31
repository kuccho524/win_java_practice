public class Main3 {
  public static void main(String[] args) {
    
    // int型の配列を持つ変数moneyListに「121902」、「8302」、「55100」を代入
    int[] moneyList = { 121902, 8302, 55100 };
    
    // 配列の値をfor文で取得
    for(int i = 0; i < moneyList.length; i++) {
      System.out.println(moneyList[i]);
    }

    // 配列の値を拡張for文で取得する
    for(int value : moneyList) {
      System.out.println(value);
    }
  }
}
