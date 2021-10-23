package Chapter10;

public class Item {
	String name;
	int price;

	// 引数が1つのコンストラクタ
	public Item(String name) {
		this.name = name;
		this.price = 0;
	}

	// 引数が2つコンストラクタ
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
}
