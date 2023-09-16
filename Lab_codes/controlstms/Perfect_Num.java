package lab.controlstms;
import java.util.*;
public class Perfect_Num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num,sum=0;
			
		System.out.println("enter the number");
		num=sc.nextInt();
			
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum =sum+i;
			}
		}
		if(sum==num)
		{
			System.out.println(" perfect number");
			
		}
		else
		{
			System.out.println(" not a perfect number");
		}

	}

}
