//KAUÊ DE JESUS LIVIO CB3005461
// PEDRO PAULO DOS REIS FARIA CB3007278

import java.sql.Connection;
import java.sql.SQLException;

public class Conexao {
	public static void main(String[] args) throws SQLException {
        Connection connection = new JavaConnect().getConnection();
        System.out.println("Connection working!");
        connection.close();
    }

}
