package IO_files;
import java.util.*;
public class File_writers {
	public static void main(String[] args) {
		//Create a new scanner with the specified String Object  
	Scanner scan = new Scanner("HARI IS A FULL STACK DEVELOPER IN CAPGEMINI");  
       //Print the line  
    System.out.println("" + scan.nextLine());  
      //Check if there is an IO exception  
    System.out.println("Exception Output: " + scan.ioException());  
    scan.close();   
}  
}


