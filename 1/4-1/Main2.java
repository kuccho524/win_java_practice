public class Main2 {
  public static void main(String[] args) {

    // 3つの口座残高「121902」、「8302」、「55100」が格納されているint型の配列moneyListを宣言
    int[] moneyList = {121902, 8302, 55100};

    // 要素をfor文で取り出す
    for(int i = 0; i < moneyList.length; i++) {
      System.out.println(moneyList[i]);
    }

    // 拡張for文で取り出す
    for(int value : moneyList) {
      System.out.println(value);
    }
  }
}
