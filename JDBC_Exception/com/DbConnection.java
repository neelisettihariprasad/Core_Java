package Test.com;
import java.sql.*;
import java.sql.Connection;
public class DbConnection {
	public Connection con;
	public PreparedStatement ps;
    public void GetConnection ()throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
	     con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Empdb","root", "root");
		
		 System.out.println("DB connection established");
	}
    public void InsertRecord(int no, String na, String job, float salary) throws Exception
	{
		ps=con.prepareStatement("insert into enp values (?,?,?,?)");
		ps.setInt(1, no);
		ps.setString(2, na);
		ps.setString(3, job);
		ps.setFloat(4, salary);
		
		int i= ps.executeUpdate();
		
		if(i>0)
			System.out.println(i + " Record inserted successfully");
		else
			System.out.println("Record not inserted");	
	}
   public void selectRecords() throws Exception
   {
		ps= con.prepareStatement("select * from emp");
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())
			
		{
			
			System.out.println(rs.getInt(1) +"\t"+ rs.getString(2)+ "\t" + rs.getString(3)+ "\t" + rs.getFloat(4));
		}
}}
