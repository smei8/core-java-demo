import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertJdbcDemo {

	public static void main(String[] args) {
		
		//step 1
		try {
			Class.forName("org.postgresql.Driver"); //using class.forname to load the driver
			System.out.println("Driver Loaded .... ");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
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
			
			//step 3
			Statement stmt = con.createStatement();
			int studId = 108;
			String studName = "vhd";
			int studContact = 777777;
			int studMark = 55;
			String studCity = "st.louis";
			
			String query = "insert into student_details values("+studId+", '"+studName+"', '"+studMark+"', '"+studContact+"', '"+studCity+"')";
			System.out.println(query);
			
			int rows = stmt.executeUpdate(query); // this method returns an int
			
			System.out.println(rows + " affected ... ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		//step 4
	}

}
