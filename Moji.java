public class Moji {
  public static void main(String[] args) {
    
    // String型を持つ変数str1を初期化して代入
    String str1 = "Java";

    // インスタンスを作成してString型を持つ変数str2に代入する
    String str2 = new String("Java");

    // 比較演算子で比べてtrueなら「==」を返す
    if(str1 == str2) System.out.println("==");

    // equalsメソッドで比較してtrueなら「equals」を返す
    if(str1.equals(str2)) System.out.println("equals");
  }
}
