package chapter4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Properties;
import java.util.TimeZone;

public class Main {

	public static void main(String[] args) throws Exception {

		// 何らかのデータを読み込む処理
		boolean isErr = true;
		if (isErr) {
			System.out.println("データが壊れています。異常終了します");
			System.exit(1);
		}
		System.out.println("正常終了しました");


		System.out.println("計算を開始します");

		// 何らかの計算処理
		System.out.println("計算完了。結果をメモ帳で表示します");
		ProcessBuilder pb = new ProcessBuilder(
				"c:\\windows\\system32\\notepad.exe",
				"calcreport.txt"
			);
		pb.start();

		// システムプロパティ一覧
		System.out.println("利用中のJavaバージョン");
		System.out.println(System.getProperty("java.version"));

		Properties p = System.getProperties();
		Iterator<String> i = p.stringPropertyNames().iterator();
		System.out.println("システムプロパティ一覧");
		while(i.hasNext()) {
			String key = i.next();
			System.out.print(key + " = ");
			System.out.println(System.getProperty(key));
		}

		// システムプロパティを利用した値の読み書き
		String ver = System.getProperty("rpg.version");
		String author = System.getProperty("rpg.author");
		System.out.println("RPG： スッキリ魔王征伐 ver" + ver);
		System.out.println("Developed by" + author);

		// 言語によって表示を切り替える
		Locale loc = Locale.getDefault();
		System.out.println(loc.getCountry() + "-" + loc.getLanguage());
		String now = (new SimpleDateFormat()).format(new Date());
		if (loc.getLanguage().equals("ja")) {
			System.out.println("現在の時刻は"+ now);
		} else {
			System.out.println("Current time is " + now);
		}

		// タイムゾーンを表示する
		TimeZone tz = TimeZone.getDefault();
		System.out.println("現在のタイムゾーン");
		System.out.println(tz.getDisplayName());
		if (tz.useDaylightTime()) {
			System.out.println("夏時間を採用しています");
		} else {
			System.out.println("夏時間を採用していません");
		}
		System.out.println("世界標準時との時差は");
		System.out.println(tz.getRawOffset() / 3600000 + "時間");

		// String型情報を取得して表示する
		Class<?> info1 = String.class;
		System.out.println(info1.getSimpleName());
		System.out.println(info1.getName());
		System.out.println(info1.getPackage().getName());
		System.out.println(info1.isArray());

		// Stringの親クラスを取得する
		Class<?> info2 = info1.getSuperclass();
		System.out.println(info2.getName());

		// argsは文字列として判定される
		Class<?> info3 = args.getClass();
		System.out.println(info3.isArray());

		Class<?> clazz = RefSample.class;

		// 引数１つのコンストラクタを取得し、インスタンスを生成する
		Constructor<?> cons = clazz.getConstructor(int.class);
		RefSample rs = (RefSample)cons.newInstance(256);

		// timesフィールドに関するFieldを取得して読み書き
		Field f = clazz.getField("times");
		f.set(rs,  2);
		System.out.println(f.get(rs));

		// 引数２つのhelloメソッドを取得して呼び出す
		Method m = clazz.getMethod("hell", String.class, int.class);
		m.invoke(rs,  "reflection!", 128);

		// クラスやメソッドへの修飾（publicやfinalの有無）を調べる
		boolean pubc = Modifier.isPublic(clazz.getModifiers());
		boolean finm = Modifier.isFinal(m.getModifiers());
	}

}
