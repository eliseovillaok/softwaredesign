package org.eliseovilla.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BaseDeDatos {

	public static void main(String[] args) {
		// Driver "flexible"
		String driver = "org.apache.derby.jdbc.EmbeddedDriver";
		try {
			Class.forName(driver).getDeclaredConstructor().newInstance();	
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
		
		// URI DB
		String uri = "jdbc:derby:MyDerbyDB;create=true";
		
		try {
			Connection conn = DriverManager.getConnection(uri);
			createTable(conn);
			addPersona(conn,1,"Eliseo","Villa");
			addPersona(conn,2,"Alfonso","Ramirez");
			
			
			
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(1);
		}

	}

	private static void createTable(Connection conn) throws SQLException {
		String table = "CREATE TABLE persona ("+
						"id INT,"+
						"first_name VARCHAR(50),"+
						"last_name VARCHAR(50))";
		conn.prepareStatement(table).execute();
		conn.commit();
	}

	private static void addPersona(Connection conn, int id, String first_name, String last_name) throws SQLException {
		String insert = "INSERT INTO persona (id,first_name,last_name) VALUES (?,?,?)";// (?,?,?) es para evitar SQL INJECTIONS
		// Creamos la preparacion de la sentencia
		PreparedStatement ps = conn.prepareStatement(insert);
		// Mapeamos las variables para evitar SQL INJECTION
		ps.setInt(1, id);
		ps.setString(2, first_name);
		ps.setString(3, last_name);
		ps.executeUpdate();
		ps.close();
		conn.commit();
	}

}
