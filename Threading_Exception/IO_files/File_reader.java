package IO_files;
import java.io.*;
public class File_reader {

	public static void main(String[] args) throws IOException{
		FileReader f=new FileReader("C:\\HARI\\hariprasadnnJ.txt");
		BufferedReader b=new BufferedReader(f);
		String str=null;
		while( true )
		{ 
	    try
		{ 
			str=b.readLine();
		    if(str.equals(null))
		    break;
		    System.out.println(str);
		}
		catch(IOException e)
		{ 
			break; 
	    }
		}
		b.close();
		
		f.close();
	}}
