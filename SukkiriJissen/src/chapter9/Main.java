package chapter9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		// JDBCを操作する基本パターン

		// 事前準備
		try {
			Class.forName("org.h2.driver");
		} catch (ClassNotFoundException e) {
			throw new IllegalStateException("ドライバのロードに失敗しました");  // JDBCドライバやJAR見つからない場合の処理
		}

		Connection con = null;

		try {
			// データベースの接続
			con = DriverManager.getConnection("jdbc:h2:~/rpgdb");  // JDBCURLを指定
			con.setAutoCommit(false);

			// SQL送信処理
			/*
			 * *******************************
			 *
			 * メインのDB操作処理
			 *
			 * *******************************
			 */
			con.commit()
;
			// 送信すべきひな形の準備
			PreparedStatement pstmt = con.preparedStatement("DELETE FROM MONSTERS WHERE HP <= ? OR NAME = ?");

			// ひな形に値を流し込みSQL文を組み立てる
			pstmt.setInt(1, 10);
			pstmt.setString(2, "ゾンビ");

			// 組み立て終えたSQL文をDBMSに送信する
			int r = pstmt.executeUpdate();

			// 処理結果を判定する
			if (r != 0) {
				System.out.println(r + "件のモンスターを削除しました");
			} else {
				System.out.println("該当するモンスターはありませんでした");
			}
			pstmt.close();

			/*
			 * SQL文のひな形を準備する
			 *
			 * PreparedStatement pstmt = con.preparedStatement(SQLのひな形);
			 */

			/*
			 * SQL文のひな形に値を流し込む
			 *
			 * pstmt.setInt(パラメータ番号, 数値);
			 * pstmt.setString(パラメータ番号, 文字列);
			 *
			 * ※最初のパラメータ番号は0ではなく1
			 */

			/*
			 * 更新系SQL文の送信
			 *
			 * int r = pstmt.executeUpdate();
			 */

			/*
			 * 検索系SQL文の送信
			 *
			 * ResultSet rs = pstmt.executeQuery();
			 */

			/*
			 * ResultSetの利用のイディオム
			 * while (rs.next())・・・検索結果の全行を順に処理
			 * if (rs.next())・・・検索結果があるかないかを判定
			 */

			/*
			 * 自動コミットモードの解除
			 * con.setAutoCommit(false);
			 *
			 * 送信済みの処理要求の確定（コミット）
			 * con.commit();
			 *
			 * 送信済みの処理要求のキャンセル（ロールバック）
			 * con.rollback();
			 */

		} catch (SQLException e) {
			e.printStackTrace();  // 接続やSQL処理失敗時の処理

			try {
				con.rollback();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		} finally {
			// データベース接続の切断
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e3) {
					e3.printStackTrace();  // 接続失敗時の処理
				}
			}
		}

	}

}
