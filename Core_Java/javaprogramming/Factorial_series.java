package hari.javaprogramming;

import java.util.Scanner;

public class Factorial_series 
{

	public static void main(String[] args)
	{
		int fact=1,factsum=0;
		Scanner key=new Scanner(System.in);
		System.out.println("enter n value");
         int n=key.nextInt();
        for (int i=1;i<=n;i++)
        {
        	fact=(fact*i);
        	factsum=factsum+fact;
        }System.out.println(factsum);
	}

}
