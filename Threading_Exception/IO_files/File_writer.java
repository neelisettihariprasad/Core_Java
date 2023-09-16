package IO_files;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class File_writer {
	public static void main(String[] args) throws IOException{
		DataInputStream dis = new DataInputStream(System.in);
		FileWriter fw = new FileWriter("C:\\HARI\\HASINI.txt",true);
		BufferedWriter br=new BufferedWriter(fw);
		 String str=null;
		 int size;
		 while( true )
		 { 
			 str=dis.readLine();
		 	 	if(str.equals("null"))
		 			 break;
		 			 size=str.length();
		 			 br.write(str,0,size); 
		 			 br.write("\n");
		 			 }
		 			 br.close();
		 			 fw.close();
	}
}


