package Test.com;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class GFG {
	// Step1: Main driver method
		public static void main(String[] args)
		{
			// Step 2: Making connection using
			// Connection type and inbuilt function on
			Connection con = null;
			//PreparedStatement p = null;
		//	ResultSet rs = null;

			con = connection.connectDB();

			// Try block to catch exception/s
			try {
				String sql = "select * from students";
				PreparedStatement	ps= con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();

				
				System.out.println("id\t\tname\t\temail");

				// Condition check
				while (rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String email = rs.getString("email");
					System.out.println(id + "\t\t" + name
									+ "\t\t" + email);
				}
			}

			// Catch block to handle exception
			catch (SQLException e) {

				// Print exception pop-up on screen
				System.out.println(e);
			}
		}
	}
				


