package paiza;

import java.util.Scanner;

public class Chapter9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		System.out.println(count);

		// countの数だけstringを受け取る
		for (int i = 0; i < count; i++) {
			String name = scan.next();
			System.out.println("Hello " + name);
		}
	}
}
