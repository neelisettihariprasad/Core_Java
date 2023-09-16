package Test.com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class connection {

   static  Connection con = null;

	public static Connection connectDB()
	{
		try {
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root", "root");	
		}
		catch (SQLException e) {

			System.out.println(e);
		}
		return con;	
		
	}
}

