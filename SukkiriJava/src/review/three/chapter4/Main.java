package review.three.chapter4;

public class Main {

	public static void main(String[] args) {
		/*
		 * 以下の配列を準備する
		 * ①int型の値を4個まとめて格納できる配列points
		 * ②double型の値を5個まとめて格納できる配列weights
		 * ③boolean型の値を3個まとめて格納できる配列answers
		 * ④String型の値を3個まとめて格納できる配列names
		 */

		int[] points = new int[4];
		double[] weights = new double[5];
		boolean[] answers = new boolean[3];
		String[] names = new String[3];


		/*
		 * ①3つの口座残高が格納されているint型配列moneyListを宣言
		 * ②その配列の要素をfor文で取り出す
		 * ③②を拡張for文で取り出す
		 */
		int[] moneyList = { 121902, 8302, 55100 };
		for (int i = 0; i < moneyList.length; i++) {
			System.out.println(moneyList[i]);
		}
		for (int i : moneyList) {
			System.out.println(i);
		}


		/*
		 * 「数あてクイズ」のプログラムを作成する
		 * ①int型で要素数3の配列numbersを準備します。この時の初期値はそれぞれ「3」、「4」、「9」とする
		 * ②画面に「1桁の数字を入力してください」と表示する
		 * ③標準入力を変数inputに代入する
		 * ④配列をループで回し、もし等しければ「アタリ！」と表示する
		 */

		int[] numbers = { 3, 4, 9 };
		System.out.println("1桁の数字を入力して下さい");
		int input = new java.util.Scanner(System.in).nextInt();

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == input) {
				System.out.println("アタリ！");
			}
		}

	}

}
