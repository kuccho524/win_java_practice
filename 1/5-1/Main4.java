/* 三角形の面積と円の面積を求める */

public class Main4 {
  public static void main(String[] args) {
    double triangle = calcTriangleArea(5.6, 8.9);
    double circle = clacCircleArea(7);

    System.out.println("三角形の面積は" + triangle + "平方cmです");
    System.out.println("円の面積は" + circle + "平方cmです");
  }

  // 三角形の面積を求めるclacTriangleAreaメソッドを定義
  public static double calcTriangleArea(double bottom, double height) {
    double area = bottom * height / 2.0;
    return area;
  }

  // 三角形の面積を求めるclacCircleAreaメソッドを定義
  public static double clacCircleArea(double radius) {
    double area = radius * radius * 3.14;
    return area; 
  }
}
