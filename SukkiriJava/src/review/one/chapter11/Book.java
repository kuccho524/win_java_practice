package review.one.chapter11;

public class Book extends TangibleAsset {

	// フィールド
	String isbn;

	// コンストラクタ
	public Book (String name, int price, String color, String isbn) {
		super(name, price, color);
		this.isbn = isbn;
	}

	// メソッド
	public String getIsbn() {
		return this.isbn;
	}

	/*
	 * public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price =price;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	 */

}
