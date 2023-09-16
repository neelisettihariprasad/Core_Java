package Test.com;

public class EMp_implementation {

	public static void main(String[] args) throws Exception{
		
        DbConnection dc = new DbConnection();
		
			dc.GetConnection();
			dc.InsertRecord(1, "Hari", "Full Stack Developer",27000 );
			dc.InsertRecord(2, "Srinu", "Python Developer",25000);
			dc.InsertRecord(1, "Sivaji", "Technical Support",25000 );
			dc.InsertRecord(1, "Hariprasad", "MERN Full Stack Developer",27000 );
	       dc.selectRecords();
	

	}

}
