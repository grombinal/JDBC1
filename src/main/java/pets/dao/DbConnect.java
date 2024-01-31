package pets.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import pets.exceptions.DbException;

public class DbConnect {
 private static final String SCHEMA = "pets";
 private static final String HOST = "localhost";
 private static final String USER = "pets";
 private static final String PASSWORD = "pets";
 private static final int PORT = 3306;
 
 public static Connection getConnection() {
	 String url = String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s&useSSL=false",HOST, PORT, SCHEMA, USER, PASSWORD);
	 
	 System.out.println("Connecting with url= " + url);
	 
	 try {
		Connection conn = DriverManager.getConnection(url);
		System.out.println("Connection Success");
		return conn;
		
	} catch (SQLException e) {
		//Unchecked exceptions
		throw new DbException(e);
	}
	 
 
 }
 
 
 
 
 
}
