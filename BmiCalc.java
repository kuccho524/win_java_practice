/*
BMI計算プログラム
<BMI計算式>
BMI = 体重 / (身長 * 身長)
*/

import java.util.Scanner;

class BmiCalc {
  public static void main(String[] args){

    // 必要な変数をdouble型で定義する
    double weight, height, bmi;

    // 1番目の入力値取得前に宣言
    Scanner stdIn = new Scanner(System.in);

    // 体重入力
    System.out.println("体重を入力してください");
    weight = stdIn.nextDouble();

    // 身長入力
    System.out.println("身長(cm)を入力してください");
    height = stdIn.nextDouble();
    height /= 100;

    // BMI値を計算
    bmi = weight / (height * height);

    // 結果を出力する
    System.out.println("あなたのBMI値は" + bmi + "です。");

    // bmiの結果で「肥満です」、「普通です」、「瘦せ型です」と結果を分岐
    if (bmi < 18) {
      System.out.println("瘦せ型です");
    } else if (bmi < 25) {
      System.out.println("普通です");
    } else {
      System.out.println("肥満です");
    }

  }

}