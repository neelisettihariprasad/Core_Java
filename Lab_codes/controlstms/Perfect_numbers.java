package lab.controlstms;
import java.util.*;
public class Perfect_numbers {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter n1 and n2  ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
				 
		for(int i=n1;i<=n2;i++)
		{
			int n=i;
			int sum=0,fact=1;
			while(fact<n)
			{
				if((n%fact)==0)
				{
					sum=sum+fact;
				}
			    fact++;
						
		    }
			if(sum==i)
			{
			   System.out.println(i);
			}
		}
}

}
