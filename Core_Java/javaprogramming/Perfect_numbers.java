package hari.javaprogramming;

public class Perfect_numbers 
{

	public static void main(String[] args)
	{
		int i,j,num,sum;
		for( i=1000;1<10000;i++) 
		{
			  sum=0;
			  num=i;
			for( j=1;j<num;j++)
			{
				if(num%j==0)
				{
					sum=sum+i;
					break;
				}
			}
			if(sum==num)
			{
				System.out.println(i);
			}
		}

	}

}
