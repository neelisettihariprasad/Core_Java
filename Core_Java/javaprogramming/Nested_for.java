package hari.javaprogramming;

import java.util.Scanner;

public class Nested_for
{

	public static void main(String[] args) 
	{
		Scanner key=new Scanner(System.in);
		System.out.println(" enter min and max range");
        int min=key.nextInt();
        int max=key.nextInt();
        for(int i=min;i<=max;i++) 
        {
        	int n=i;
        	int count=0;
        	for(int j=min;j<=n;i++)
        	{
        		if(n%j==0) 
        		{
        			count++;
        		}
        	}
        	if(count==0) 
        	{
        		System.out.println(i);
        	}
        }
	}

}
