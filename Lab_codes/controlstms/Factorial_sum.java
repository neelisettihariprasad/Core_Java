package lab.controlstms;
import java.util.*;
public class Factorial_sum {
	public static void main(String[] args) {

			Scanner obj = new Scanner(System.in);
				     
			int n;
			long f=1;
			long sum=0;

			System.out.print("Enter n value");
			n= obj.nextInt();

			for(int i=1;i<=n;i++)
			{
			   f=1; 
			   for(int j=1;j<=i;j++)
			   {
				    f=f*j;
			   }
			   sum=sum+f;
			   System.out.print(f+" ! + ");
		     }
			 System.out.println("\n factorial sum is "+sum);

	}

}
