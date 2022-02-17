import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertPreparedJdbcDemo {

	public static void main(String[] args) {
		//step 1
				try {
					Class.forName("org.postgresql.Driver"); //using class.forname to load the driver
					System.out.println("Driver Loaded .... ");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} 
				
				//step 2
				Connection con = null; //be familiar with the API
				
				try {

					String connectionURL = "jdbc:postgresql://localhost:5432/sample";
					String userName = "postgres";
					String password = "Aug211997!";
					
					con = DriverManager.getConnection(connectionURL, userName, password);
					
					if(con != null) {
						System.out.println("Connection Established ... ");
					} else {
						System.out.println("Connection not Established ... ");
					}
					
//					//step 3
//					Statement stmt = con.createStatement(); at the time of creating the statement you do not pass the query
//					int studId = 108;
//					String studName = "vhd";
//					int studContact = 777777;
//					int studMark = 55;
//					String studCity = "st.louis";
//					
//					String query = "insert into student_details values("+studId+", '"+studName+"', "+studMark+", "+studContact+", '"+studCity+"')";
//					System.out.println(query);
//					
//					int rows = stmt.executeUpdate(query); // this method returns an int //for DML
					
//					System.out.println(rows + " affected ... ");
	
					String query = "insert into student_details values(?,?,?,?,?)"; //the convenience of prepared statements is can put placeholder, ? at the time of what
					PreparedStatement psmt = con.prepareStatement(query); //have to pass query at the time of creating the prepared statement
					//^ here 1 hit to DB, 1 Compile
					
					psmt.setInt(1, 112);
					psmt.setString(2, "jrh");
					psmt.setInt(3, 677889);
					psmt.setInt(4, 70);
					psmt.setString(5, "North blue");
					
					int row = psmt.executeUpdate(); //returns a int value // dont have to pass the query
					//^ 1 hit to DB and 1 Execution
					System.out.println(row + " row(s) affected ... ");
					
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					try {
						con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}

		// step3

		// step4

	}

}
