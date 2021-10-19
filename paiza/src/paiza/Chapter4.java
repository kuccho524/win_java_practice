package paiza;

// java.util.*をインポートする
import java.util.Scanner;

public class Chapter4 {
	public static void main(String[] args) {

		// 入力された文字列を受け取るための変数scanを宣言
        Scanner scan = new Scanner(System.in);

        // 受け取った文字列を変数textに格納
        String text = scan.next();
        System.out.println("Hello" + text);
    }
}
