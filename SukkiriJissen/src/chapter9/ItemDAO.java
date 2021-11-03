package chapter9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ItemDAO {
	public static ArrayList<Item> findBYMnimumPrice(int i) {
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection con = null;

		try {
			con = DriverManager.getConnection("jdbc:h2:~/rpgdb");
			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM ITEMS WHERE PRICE > ?");
			pstmt.setInt(1, i);
			ResultSet rs = pstmt.executeQuery();
			ArrayList<Item> items = new ArrayList<>();

			while (rs.next()) {
				Item item = new Item();
				item.setName(rs.getString("NAME"));
				item.setPrice(rs.getInt("PRICE"));
				item.setWeight(rs.getWeight("WEIGHT"));
				items.add(item);
			}
			rs.close();
			pstmt.close();
			return items;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
