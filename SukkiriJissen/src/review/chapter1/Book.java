package review.chapter1;

import java.util.Date;
import java.util.Objects;

// Book型を持つComparableとcloneableを実装する
public class Book implements Comparable<Book>, Cloneable {

	// フィールド宣言
	private String title;
	private Date publishDate;
	private String comment;

	// メソッド
	public String getTitle() {
		return this.title;
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

	public void setComment(String Comment) {
		this.comment = comment;
	}

	/*
	 * 以下を実現するためにBookクラスを改良する
	 *
	 * ①書名と発行日が同じであれば等価なものとして判定され、かつ、HashSetなどに格納しても正しく利用でする ⇒ hashCode()、equals()メソッド
	 * ②発行日が古い順を自然順序とする ⇒ compareTo()メソッド
	 * ③clone()を呼び出すと、深いコピーによる複製が行われる ⇒ clone()メソッド
	 */

	// hashCode()メソッドをオーバーライド
	public int hashCode() {
		return Objects.hash(this.title, this.publishDate, this.comment);

		/*
		 * Objects.hashは可変引数で渡したオブジェクトのハッシュ値を計算する。
		 * 引数にフィールドの値を渡している
		 */
	}

	// equalsメソッドをオーバーライド
	public boolean equals(Object o) {

		// thisがoと同値の場合trueを返す
		if (this == o) {
			return true;
		}

		// oがnullの場合falseを返す
		if (o == null) {
			return false;
		}

		// オブジェクトがBookクラスのインスタンスでない場合、falseを返す
		if (!(o instanceof Book)) {
			return false;
		}

		// oをキャスト式でBook型にし、Book型の変数bookに代入
		Book b = (Book)o;

		// publishDateが異なるときfalseを返す
		if (!publishDate.equals(b.publishDate)) {
			return false;
		}

		// titleが異なるときfalseを返す
		if (!title.equals(b.title)) {
			return false;
		}

		// 戻り値にtrueを返す
		return true;


		/*
		 * instanceof演算子は、あるオブジェクトの型を動的に判定するための演算子
		 * 以下の用途で使用される
		 *
		 * ・オブジェクトが、あるクラスのインスタンスか
		 * ・オブジェクトが、あるクラスの子クラスのインスタンスか
		 * ・オブジェクトが、特定のインターフェースを実装したインスタンスか
		 */
	}

	// ②を実現するために、compareTo()メソッドをオーバーライし、引数にBook型の変数oを指定する
	public int compareTo(Book o) {
		return this.publishDate.compareTo(o.publishDate);

		/*
		 * compareTo()メソッド
		 * compareToメソッドでは比較した値のどちらが大きいか、または同じかを比較することができる
		 */
	}

	// ③を実現するために、clone()メソッドをオーバーライド
	public Book clone() {

		// Book型の変数bにインスタンスを生成したものを格納
		Book b = new Book();

		// フィールド宣言
		b.title = this.title;
		b.comment = this.comment;
		b.publishDate = this.publishDate;

		// 変数bを戻す
		return b;
	}
}
