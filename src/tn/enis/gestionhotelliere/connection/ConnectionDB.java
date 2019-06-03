package tn.enis.gestionhotelliere.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {

	public static Connection connection;

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return connection;
	}
}
