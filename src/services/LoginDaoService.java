package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.DBUtil;

public class LoginDaoService {
	public static Connection connection = null;

	public boolean validateUser(String userName, String passWord) {
		boolean validateFlag = false;
		connection = DBUtil.getConnection();
		if (connection != null) {

			System.out.println("inside connection != null");
			try {
				PreparedStatement preparedStatement = connection
						.prepareStatement("select * from usertable where username =? and password =?");
				preparedStatement.setString(1, userName);
				preparedStatement.setString(2, passWord);

				ResultSet resultSet = preparedStatement.executeQuery();

				if (!resultSet.next()) {
					System.out.println("inside resultset != null");

					validateFlag = false;
				} else {
					while (resultSet.next()) {
						System.out.println("Result present");
						System.out.println(resultSet.getString("USERNAME"));
					}
					System.out.println("Invalid Credentials");
					validateFlag = true;
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return validateFlag;
	}
}