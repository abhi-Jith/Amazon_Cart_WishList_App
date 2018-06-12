package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection conn = null;

	public static Connection getConnection() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password");
			if (conn != null) {
				System.out.println("Connected to the database");
			}

		} catch (SQLException e) {
			System.out.println("Connection UnSuccessful");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Connection UnSuccessful");
			e.printStackTrace();
		}
		return conn;
	}
}
