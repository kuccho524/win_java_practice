package review.three.chapter3;

public class Main {

	public static void main(String[] args) {
		/*
		 * 以下を条件式で表す
		 * ①変数weightの値が60に等しい
		 * ②変数age1とage2の合計を2倍したものが60を超えている
		 * ③変数ageが奇数である
		 * ④変数nameの中身の文字列が「湊」と等しい
		 */

		/*
		 *  ① int weght == 60;
		 *  ② int (age1 + age2) * 2 > 60;
		 *  ③ int age % 2 == 1;
		 *  ④ String name == "湊";
		 */

		// int型を持つ変数isHungryに0か1を代入する。また、String型を持つ変数foodに食べ物の名前を代入する
		int isHungry = 1;
		String food = "ハンバーグ";

		// 「こんにちは」と出力する
		System.out.println("こんにちは");

		// isHungryが0であれば「お腹がいっぱいです」、そうでなければ「はらぺこです」と出力する
		if (isHungry == 0) {
			System.out.println("お腹がいっぱいです");
		} else {
			System.out.println("はらぺこです");

			// 変数foodを用いて「○○いただきます」と出力する
			System.out.println(food + "いただきます");
		}

		// 「ごちそうさまでした」と出力する
		System.out.println("ごちそうさまでした");


		// 「[メニュー]1：検索 2：登録 3：削除 4：変更＞」と出力する
		System.out.print("[メニュー]1：検索 2：登録 3：削除 4：変更＞");

		// 数字を入力し、変数selectedに代入する
		int selected = new java.util.Scanner(System.in).nextInt();

		// switch文でそれぞれの結果を表示する
		switch (selected) {
		case 1:
			System.out.println("検索します");
			break;
		case 2:
			System.out.println("登録します");
			break;
		case 3:
			System.out.println("削除します");
			break;
		case 4:
			System.out.println("変更します");
			break;
		default:
		}


		// 「【数あてゲーム】」と出力する
		System.out.println("【数あてゲーム】");

		// 0～9までの整数の中からランダムな数を生成して変数ansに代入する
		int ans = new java.util.Random().nextInt(10);

		// 5回ループを繰り返すfor文を作る
		for (int i = 0; i < 5; i++) {
			// 「0～9の数字を入力してください」と出力する
			System.out.println("0～9の数字を入力してください");

			// 入力値を変数numに格納する
			int num = new java.util.Scanner(System.in).nextInt();

			// アタリ、はずれをif文で条件分岐する
			if (num == ans) {
				System.out.println("アタリ！");
				break;
			} else {
				System.out.println("違います");
			}
		}

		System.out.println("ゲームを終了します");

	}

}
