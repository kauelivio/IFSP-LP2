//KAUÊ DE JESUS LIVIO CB3005461
// PEDRO PAULO DOS REIS FARIA CB3007278

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Estudantes {
	private Connection connection;
    String nome;
    Integer idade;
    Double peso;
    Double altura;
    String objetivo;

    public Estudantes(){ 
        this.connection = new JavaConnect().getConnection();
    } 
    public void insert(Estudante s){ 
        String sqlInsert = "INSERT INTO students(nome, idade, peso, altura, objetivo) VALUES(?,?,?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sqlInsert);
            stmt.setString(1, s.getNome());
            stmt.setInt(2, s.getIdade());
            stmt.setDouble(3, s.getPeso());
            stmt.setDouble(4, s.getAltura());
            stmt.setString(5, s.getObjetivo());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    }

}
