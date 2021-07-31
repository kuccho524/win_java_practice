/* 面積を求めるプログラム */

public class Main7 {
  
  public static void main(String[] args) {

    // double型の変数を持つtriangle、circle、trapezoidを宣言し、各メソッドに値を代入
    double triangle = calcTriangleArea(5.6, 8.9);
    double circle = calcCircleArea(6.8);
    double trapezoid = calcTrapezoidArea(6.7, 4.3, 4.2);

    // 各面積を出力
    System.out.println("三角形の面積は" + triangle + "平方cmです");
    System.out.println("円の面積は" + circle + "平方cmです");
    System.out.println("台形の面積は" + trapezoid + "平方cmです");
  }

  // double型の引数bottomとheightを持つcaclTriangleAreaメソッドを定義
  public static double calcTriangleArea(double bottom, double height) {

    // 三角形の面積を求め、double型を持つ変数areaを宣言
    double area = bottom * height / 2;
    return area;
  }

  // double型の引数radiusを持つcalcCircleAreaメソッドを定義
  public static double calcCircleArea(double radius) {
    
    // 円の面積を求め、double型を持つ変数areaを宣言
    double area = radius * radius * 3.14;
    return area;
  }

  // double型の引数top、bottom、heightを持つcalcTrapezoidAreaメソッドを定義
  public static double calcTrapezoidArea(double top, double bottom, double height) {

    // 台形の面積を求め、double型を持つ変数areaを宣言
    double area = (top + bottom) * height / 2;
    return area;
  }
}
