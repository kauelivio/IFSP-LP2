//KAUÊ DE JESUS LIVIO CB3005461
// PEDRO PAULO DOS REIS FARIA CB3007278

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaConnect {

	String url = "jdbc:sqlserver://localhost:1433;databaseName=estudantes";
	String user = "kaue";
	String password = "1234567890";

	public Connection getConnection() {
		try {
			return DriverManager.getConnection(url, user, password);				
		}			
		catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
}

