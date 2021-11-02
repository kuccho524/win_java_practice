package chapter7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import java.util.ResourceBundle;

public class Main {

	public static void main(String[] args) throws Exception {
		// split()メソッドを使った文字列分解
		String s = "ミナト,アサカ,スガワラ";
		String[] st = s.split(",");
		for (String t : st) {
			System.out.println(t);
		}

		// commons-csvの利用例
		FileReader fr = new FileReader("rpgsave.csv");
		Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(f);
		for (CSVRecord r : records) {
			String name = r.get(0);
			String hp = r.get(1);
			String mp = r.get(2);
			System.out.println(name + "/" + hp + "/" + mp);
			fr.close();
		}

		// プロパティファイルを読み取る
		Reader r = new FileReader("c:\\rpgdata.properties");
		Properties p = new Properties();
		p.load(r);
		String name = p.getProperty("heroName");
		String strHp = p.getProperty("heroHp");
		int hp = Integer.parseInt(strHp);
		System.out.println("勇者の名前" + name);
		System.out.println("勇者のHP" + hp);
		fr.close();

		// プロパティファイルを書き込む
		Writer fw = new FileWriter("c:\\rpgsave.properties");
		Properties pr = new Properties();
		pr.setProperty("heroName", "アサカ");
		pr.setProperty("heroHp", "62");
		pr.setProperty("heroMp", "45");
		pr.store(fw, "勇者の情報");
		fw.close();

		// ResourceBundleを用いたファイルの読み取り
		ResourceBundle rb = ResourceBundle.getBundle("jp.miyabilink.rpg.rpgdata");
		String heroName1 = rb.getString("heroName");
		System.out.println("勇者の名前：" + heroName1);


		// 章末問題7-1
		Reader r1 = new FileReader("c\\pref.propaties");
		Properties p1 = new Properties();
		p1.load(r1);
		System.out.println(p1.getProperty("aichi.capital") +"：" + p1.getProperty("aichi.food"));
		r1.close();


		// 章末問題7-2
		ResourceBundle rb1 = ResourceBundle.getBundle("pref");
		System.out.println(rb1.getString("aichi.capital") +  "：" + rb1.getString("aichi.food"));


		// 章末問題7-3
		Employee tanaka = new Employee();
		tanaka.name ="田中一郎";
		tanaka.age = 41;
		Department soumubu = new Department();
		soumubu.name = "総務部";
		soumubu.leader = tanaka;
		FileOutStream fos = new FileOutStream("company.dat");
		ObjectOutStream oos = new ObjectOutStream(fos);
		oos.writeObject(soumubu);
		oos.flush();
		oos.close();
	}

}
