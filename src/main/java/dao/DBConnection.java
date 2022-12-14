package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static Connection connection=null; 
	public static Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			System.out.println("Connection is established");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
		
	}
}
