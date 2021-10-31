package chapter5;

import java.util.Date;

public class Book implements Comparable<Book>, Cloneable {

	// フィールド
	private String title;
	private Date publishDate;
	private String comment;

	/*
	 * 以下の条件を実現する
	 * ①署名と発効日が同じであれば等価なものと判定され、かつ、HashSetなどに格納しても正しく表示される
	 * ②発行日が古い順に表示される
	 * ③clone()を呼び出すと、深いコピーによる複製が行われる
	 */

	// hashCodeメソッドをオーバーライド
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	// equals()メソッドをオーバーライド
	public boolean equals(Object o) {
		return EqualsBuilder.reflectionEquals(this, o);
	}

	// compareTo()メソッドをオーバーライド
	public int compareTo(Book o) {
		return CompareToBuilder.reflectionCompare(this, o, "Comment", "title");
	}

	// clone()メソッドをオーバーライド
	public Book clone() {
		Book b = new Book();
		b.title = this.title;
		b.comment = this.comment;
		b.publishDate = (Date)this.publishDate.clone();
		return b;
	}

	public String getTitle() {
		return this.title = title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getPublishDate() {
		return this.publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
