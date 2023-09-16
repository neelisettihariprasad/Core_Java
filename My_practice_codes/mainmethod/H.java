package mainmethod;

//port java.util.Scanner;

public class H 
{
	public static void prime(int n)
	{
		
		//Scanner scan=new Scanner(System.in);
		int count=0;
		for(int a=1;a<=n;a++)
		
			
		{
			if(n%a==0)
			{
				count++;
				
				
			}
		}
		if(count==2)
		{
			System.out.println(" prime");
		}
		else 
		{
			System.out.println("not prime");
		}
		
	}
	public static void main (String[]args) 
	{
	   prime(9);
		
	}

}
