package lab.controlstms;
import java.util.*;
public class Extracted_string {

	public static void main(String[] args) {
		String txt, str="";
		char ch;
					
		Scanner obj = new Scanner(System.in);
			
		System.out.println("Enter your text ");
		txt = obj.next();
					
		for(int i=0;i<txt.length();i++)
		{
			ch = txt.charAt(i);
						
			
			if(ch>='a' & ch<='z' | ch>='A' & ch<='Z')
			str=str + ch;
				
		}
		System.out.println("Extracted string is :"+ str);
			
		}


}
