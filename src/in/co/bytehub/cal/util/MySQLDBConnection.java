package in.co.bytehub.cal.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLDBConnection {

	public static Connection getConnection() {

		try {
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost/mytestdb?user=root&password=pass");
			return connection;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
