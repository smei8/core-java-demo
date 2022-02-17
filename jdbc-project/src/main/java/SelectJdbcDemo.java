import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectJdbcDemo {

	public static void main(String[] args) {
		// step1 - load the driver into the memory
			//any class you work with has to be first loaded into the memory
			//we are not creating an object of the driver we just want to load it in memory
		
		try {
			// a class called Class in java
			Class.forName("org.postgresql.Driver"); 	//Class.forname() is used to load any class into memory, not only driver
														//pass in the fully qualified name of the driver that i want to load to the memory
														//use to load any class not only the driver into memory without creating a object
														//Driver is a class that is in the postgresql package which is inside org package
			System.out.println("Driver loaded ... ");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//interface Connection
		Connection conn = null;
		try {
			//step2 - establish connection with DB
			//specify ip address, port number, protocol credentials
			//connection url has the protocol//ipaddress:portnumber/databaseName;
					//protocol will change depending on which database you are connecting to 
			String connectionURL = "jdbc:postgresql://localhost:5432/sample"; //or 127.0.0.1
			String userName = "postgres";
			String password = "Aug211997!";
			
			conn = DriverManager.getConnection(connectionURL, userName, password);  //
			if(conn != null) {
				System.out.println("Connection Established ... ");
			} else {
				System.out.println("Connection not Established ... ");
			}
			
			//step3 - create a statement and execute it
			Statement stmt = conn.createStatement();
			
			//execute the statement
			String query = "select * from student_details";  //for DQL
			//boolean status = stmt.execute("create/alter/drop..."); //DDL
			ResultSet rs = stmt.executeQuery(query);  //output is a result set
			
			//iterating through the result set to get each of the data
			while(rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getInt(4) + "\t" + rs.getString(5));
			}
			
		} catch (SQLException e) {
			//step4 - handle the exception
			e.printStackTrace();
		} finally {
			//any connection made to the database must be closed
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}	
		 
	}

}
