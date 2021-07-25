public class Areas {

  // mainメソッドを定義
  public static void main(String[] args) {

    // 面積を求める各クラスを呼び出す。
    double triangle = areaTriangle(13.0, 5.0);
    double square = areaSquare(8.2, 8.8);
    double trapezoid = areaTrapezoid(3.6, 7.4, 4.2);
    double circle = areaCircle(7.7);

    // 各形の面積を出力する。
    System.out.println("三角形の面積は " + triangle + " 平方cmです。");
    System.out.println("四角形の面積は " + square + " 平方cmです。");
    System.out.println("台形の面積は " + trapezoid + " 平方cmです。");
    System.out.println("円の面積は " + circle + " 平方cmです。");
  }

  // 三角形の面積を求めるメソッドを定義
  public static double areaTriangle(double bottom, double height) {

    // double型を持つ変数areaを宣言
    double area = bottom * height / 2;

    // 戻り値areaを返す
    return area;
  }

  // 四角形の面積を求めるメソッドを定義
  public static double areaSquare(double bottom, double height) {

    // double型を持つ変数areaを宣言
    double area = bottom * height;

    // 戻り値areaを返す
    return area;
  }

  // 台形の面積を求めるメソッドを定義
  public static double areaTrapezoid(double bottom, double top, double height) {

    // double型を持つ変数areaを宣言
    double area = (top + bottom) * height / 2;

    // 戻り値areaを返す
    return area;
  }

  // 円の面積を求めるメソッドを定義
  public static double areaCircle(double radius) {

    // double型の固定値「3.14」を持つ変数PIを宣言
    final double PI = 3.14;

    // double型を持つ変数areaを宣言
    double area = radius * radius * PI;

    // 戻り値areaを返す
    return area;
  }

}