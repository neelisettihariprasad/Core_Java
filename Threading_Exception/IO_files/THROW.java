package IO_files;
import java.util.*;
public class THROW {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		try {
			System.out.println("Enter 2 integer values ");
			a=sc.nextInt();
			b=sc.nextInt();
			
			if(b==0)
			{
				Exception o = new Exception("Divisor must be non zero value ");
				throw(o); 
				
			}
			else
			{
				c=a/b;
				System.out.println("dvivison "+ c);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		
		
	}


}
