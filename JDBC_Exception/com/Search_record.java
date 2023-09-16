package Test.com;
import java.sql.Connection;
import java.util.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Search_record {
	
public static void main(String[] args) throws Exception {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		 //connection URL or string
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root", "root");
		
		 System.out.println("DB connection established...");
		
		 Scanner sc = new Scanner(System.in);
		
		 System.out.println("Enter employee number ");
		
		 int empno = sc.nextInt();
		
		 PreparedStatement ps = con.prepareStatement("select * from emp where empno=?");
				
			ps.setInt(1, empno);
			
			
			ResultSet rs= ps.executeQuery();
			
			
			
			if(rs.next())
				System.out.println(rs.getString(1) + "\t"+ rs.getString(2)+"\t"+ rs.getString(3));
			else
				System.out.println("Record not found in the DataBase");
	}
}

