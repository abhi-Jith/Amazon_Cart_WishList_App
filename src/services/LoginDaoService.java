package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDaoService {
	Connection connection = null;
	boolean validateFlag = false;

	public boolean validateUser(String userName, String password) {
		connection = DBUtil.getConnection();
		if (connection != null) {
			try {
				PreparedStatement preparedStatement = connection
						.prepareStatement("select * from userTable where username =? and password =?");
				preparedStatement.setString(1, userName);
				preparedStatement.setString(2, password);
				ResultSet resultset = preparedStatement.executeQuery();

				if (resultset != null) {
					while (resultset.next()) {
						System.out.println("Result present");
						System.out.println(resultset.getString("USERNAME"));
					}
					validateFlag = true;
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else if (connection == null) {
			System.out.println("Connection failed");
		}
		return validateFlag;
	}
}