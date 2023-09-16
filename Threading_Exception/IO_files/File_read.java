package IO_files;
import java.io.*;
public class File_read {
	public static void main(String[] sun) throws IOException
	{
	FileReader f=new FileReader("C:\\HARI\\hariprasadnn.txt");
	BufferedReader b=new BufferedReader(f);
	String str=null;
	while( true )
	{ try
	{ str=b.readLine();
	if(str.equals(null))
	break;
	System.out.println(str);
	}
	catch(NullPointerException e)
	{ break; }
	}
	b.close();
	
	f.close();
	}


}
