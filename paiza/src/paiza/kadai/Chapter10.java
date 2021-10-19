package paiza.kadai;

import java.util.Scanner;

public class Chapter10 {
	public static void main(String[] agrs) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		System.out.println(count);

		for(int i = 0; i < count; i++) {
			int number = scan.nextInt();
			System.out.println(number);

			if (number == 10) {
				System.out.println(number + "は10と等しい");
			} else if (number > 10) {
				System.out.println(number + "10より大きい");
			} else {
				System.out.println(number + "は10未満");
			}
		}
	}
}
