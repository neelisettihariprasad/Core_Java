package hari.javaprogramming;

public class pattern {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++)
		{
			  if(i%2==0)
			  {
				  for(j=1;j<=i;j++) 
				  System.out.print("0 ");
			  }
			  else { 
				  for( j=1;j<=i;j++)
				  System.out.print("1 ");
			}
			  System.out.println(  );

		}
	}

}
