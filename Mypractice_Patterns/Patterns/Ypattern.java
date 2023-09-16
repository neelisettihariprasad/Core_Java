package Patterns;

public class Ypattern
{

	public static void main(String[] args)
	{
		int n=6
				;
		for(int i=1;i<=n;i++)
		{
			for(int j =1;j<=n;j++)
			{
				if((j==i | j==n-i+1) && i<n/2+1 || (j==n/2+1&&i>n/2)) 
				{
					System.out.print("Y ");
				}
				else
				{
					System.out.print(" ");
				}
			}System.out.println( );
		}

	}

}
