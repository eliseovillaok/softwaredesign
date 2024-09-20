package org.eliseovilla.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BaseDeDatosPGSQL {
    private static final String URI = "jdbc:postgresql://localhost:5432/ExampleDB"; // URL de conexión
    private static final String USER = "postgres"; // Usuario de PostgreSQL
    private static final String PASSWORD = "postgres"; // Contraseña de PostgreSQL

    public static void main(String[] args) {
        try {
            // Establecer conexión
            Connection conn = DriverManager.getConnection(URI, USER, PASSWORD);
            conn.setAutoCommit(false);
            System.out.println("Conexión exitosa a la base de datos 'ExampleDB'.");
            
            //createTable(conn);
            //addPersona(conn,1,"Eliseo","Villa");
            //addPersona(conn,2,"Pepe","Ramirez");
            //deleteTable(conn);
            
            // Cerrar la conexión
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
    
	private static void deleteTable(Connection conn) throws SQLException  {
		String delete = "DROP TABLE personaa";
		conn.prepareStatement(delete).execute();
		conn.commit();
	}

	private static void createTable(Connection conn) throws SQLException {
		String table = "CREATE TABLE personaa ("+
						"id INT NOT NULL,"+
						"first_name VARCHAR(50) NOT NULL,"+
						"last_name VARCHAR(50) NOT NULL,"+
						"PRIMARY KEY (id));";
		conn.prepareStatement(table).execute();
		conn.commit();
	}

	private static void addPersona(Connection conn, int id, String first_name, String last_name) throws SQLException {
		String insert = "INSERT INTO persona (id,first_name,last_name) VALUES (?,?,?)";
		PreparedStatement ps = conn.prepareStatement(insert);
		ps.setInt(1, id);
		ps.setString(2, first_name);
		ps.setString(3, last_name);
		ps.executeUpdate();
		ps.close();
		conn.commit();
	}
}
