package IO_files;
import java.io.*;
public class FILE_WRITING {
	public void Writedata()throws Exception
	{

	FileOutputStream fout = new FileOutputStream("C:\\\\HARI\\\\HAR.txt");
	ObjectOutputStream out = new ObjectOutputStream(fout);
	 Exp_1 s = new Exp_1(1,"Hari");
	 out.writeObject(s);
	System.out.println("data written to file...");
	}
public static void main(String[] args) throws Exception {
		
		FILE_WRITING f = new FILE_WRITING();
		f.Writedata();
		
	}
}



