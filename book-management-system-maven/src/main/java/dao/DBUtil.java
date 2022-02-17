package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	static Connection conn;
	//step 1
	static {

		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static Connection obtainConnection() {
		
		//design pattern - singleton design1pattern(making sure there is only one connection we are obtaining)
		
		//step 2
		String connectionURL = "jdbc:postgresql://localhost:5432/sample";
		String userName = "postgres";
		String password = "Aug211997!";

		if(conn == null) {
			try {
				conn = DriverManager.getConnection(connectionURL, userName, password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return conn;
	}
}
