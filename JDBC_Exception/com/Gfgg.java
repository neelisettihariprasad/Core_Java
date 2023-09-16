package Test.com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
public class Gfgg {
	// MAin driver method
		public static void main(String[] args)
		{
			// Step 2: Showing above Connection class i.e
			// loading and registering drivers

			// Initially assigning NULL parameters
			// to object of Connection class
			Connection con = connection.connectDB();

			//PreparedStatement ps = null;

			// Step 3: Establish the connection
		//	con = connection.connectDB();

			// Try block to check if exception/s occurs
			try {

				// Step 4: Create a statement
			String sql = "insert into students values('1','hari',hariprasad@gmail.com)";
				// Step 5: Execute the query
			PreparedStatement ps = con.prepareStatement(sql);
				

				// Step 6: Process the results
				ps.execute();
			}

			// Optional but recommended
			// Step 7: Close the connection

			// Catch block to handle the exception/s
			catch (Exception e) {

				// Print the exception
				System.out.println(e);
			}
		}
	}

