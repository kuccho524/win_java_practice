package paiza.skill.C;

import java.util.Scanner;

/*
 * 文字列を取得し、取得した文字で足し算をする。
 * 詳しい数値は以下とする
 * ・「/」・・・1
 * ・「<」・・・10
 * ・上記以外・・・0
 */

public class Skill1 {
	public static void main(String[] args) {
        // 入力された文字列を取得する変数scを定義
        Scanner sc = new Scanner(System.in);

        // 入力値をString型を持つ変数lineに格納
        String line = sc.nextLine();

        // lineに格納されている値を1文字ずつsplitし、文字配列型の変数arraysに格納
        String[] arrays = line.split("(?!^)");

        // int型の変数totalを宣言し、0を代入
        int total = 0;

        // for文で配列の各値を取り出す
        for(int i = 0; i < arrays.length; i++) {

        	/*
        	 * if文で以下を条件分岐
        	 * 「/」・・・1を足す
        	 * 「<」・・・10を足す
        	 * 上記以外・・・0を足す
        	 */

            if (arrays[i].equals("/")) {
                total += 1;
            } else if (arrays[i].equals("<")) {
                total += 10;
            } else {
                total += 0;
            }
        }

        // 変数totalの値を出力する
        System.out.println(total);
    }
}
