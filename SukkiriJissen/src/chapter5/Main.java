package chapter5;

import java.util.logging.LogManager;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Logger logger = LogManager.getLogger(Main.class);
		if (args.length != 2) {
			logger.error("起動引数の数が異常：" + args.length);
		}
	}

}
