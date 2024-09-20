package org.eliseovilla.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {
    private static final String URI = "jdbc:postgresql://localhost:5432/ExampleDB"; // URL de conexión
    private static final String USER = "postgres"; // Usuario de PostgreSQL
    private static final String PASSWORD = "postgres"; // Contraseña de PostgreSQL

    public static void main(String[] args) {
        try {
            // Establecer conexión
            Connection conn = DriverManager.getConnection(URI, USER, PASSWORD);
            conn.setAutoCommit(false);
            System.out.println("Conexión exitosa a la base de datos 'ExampleDB'.");
            String select = "SELECT * from persona";
            ResultSet rs = conn.prepareStatement(select).executeQuery();
            while (rs.next()){
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
    

}
