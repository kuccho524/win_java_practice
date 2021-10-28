package chapter17;

import java.io.FileWriter;
import java.io.IOException;

public class Check {
	// チェック例外の伝搬とスロー宣言
			public static void subsub() throws IOException {
				FileWriter fw3 = new FileWriter("data.txt");
			}
}
