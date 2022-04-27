package basic;

import java.sql.*;

public class MysqlCon {

	public static void main(String[] args) {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Ragul@123");
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from tb");
			while (rs.next())
				System.out.println(rs.getInt(1));
			connection.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
