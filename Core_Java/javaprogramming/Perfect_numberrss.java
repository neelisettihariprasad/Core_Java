package hari.javaprogramming;

public class Perfect_numberrss {

	public static void main(String[] args) {
		for(  int i=1000;1<=10000;i++) 
		{
			 int sum=0;
			for( int j=1;j<i;j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
			}
			if(sum==i)
			{
				System.out.println(i);
			}
		}

	}

}
