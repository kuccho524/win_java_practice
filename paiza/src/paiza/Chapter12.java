package paiza;

public class Chapter12 {
	public static void main(String[] args) {
		// double型を持つ変数randにランダムに数値を格納、100倍し1を足す
		double rand = Math.random() * 100 +1;

		// 変数randをint型にキャストし、int型を持つ変数numberに格納
		int number = (int)rand;

		// 「モンスターが○○匹あらわれた」と表示する
		System.out.println("モンスターが" + number + "匹あらわれた");
	}
}
