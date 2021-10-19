package paiza;

import java.util.Scanner;

public class Chapter5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		System.out.println(number);

		// numberが10の時、「Welcome」と表示
		if (number == 10) {
			System.out.println("Welcome");
		}
	}
}
