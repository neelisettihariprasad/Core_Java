package hari.javaprogramming;

import java.util.Scanner;

public class Exp 
{

	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		System.out.println(" enter a num");
		int a=key.nextInt();
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
			
		}System.out.println(fact);

	}

}
