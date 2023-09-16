package hari.javaprogramming;

public class Patterns {

	public static void main(String[] args) {
		int i,j,k;
		int hash=5;
		int star=1;
		for(i=1;i<=6;i++)
		{
			for(j=1;j<=hash;j++)
			{
				System.out.print("# ");
			}
			for(k=1;k<=star;k++)
			{
				System.out.print("* ");
				hash--;
			}System.out.println( );
		}

	}

}
