package IO_files;
import java.io.*;
public class File_witer {
	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("C:\\HARI\\HAR.txt",true);
		BufferedWriter br=new BufferedWriter(fw);
		 String str="HI HARI! HOW R U";
		       br.write(str);
		             br.close();
		 			 fw.close();
	}
}
