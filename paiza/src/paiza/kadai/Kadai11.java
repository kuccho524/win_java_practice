package paiza.kadai;

// java.util.*をインポートする
import java.util.Scanner;

public class Kadai11 {
	public static void main(String[] args) {

		// 入力された文字列を受け取る変数scanを宣言
		Scanner scan = new Scanner(System.in);

		/*
		 * 1行目の文字列を受け取る変数messageと、
		 * 2行目の文字列を受け取る変数msgを宣言
		 */
		String message = scan.next();
		String msg = scan.next();

		// それぞれの変数に格納された値を出力する
		System.out.println(message);
		System.out.println(msg);
	}
}
