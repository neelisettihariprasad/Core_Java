package hari.javaprogramming;

public class Exponential 
{

	public static void main(String[] args) 
	{
		int i,j,k;
		int space=2;
		int star=1;
		for( i=1;i<=5;i++)
		{
			for(j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=star;k++ )
			{
				System.out.print("* ");
			}
			if(i>=3)
			{
				space++;
				star--;
			}else {
				space--;
				star++;
			}System.out.println( );
		}
		

	}

}
