package hari.javaprogramming;

import java.util.Scanner;

public class Arm {

	public static void main(String[] args) {
		Scanner key=new Scanner(System.in);
		System.out.println(" enter a num");
		int n=key.nextInt();
		int r,count=0,n2,n1,sum=0;
		n2=n1=n;
		while(n1>0)
		{
			n1=n1/10;
			count++;
		}System.out.println(count);
		while(n>0)
		{
			int lastdigit;
			int power=1;
			lastdigit=n%10;
			for(int i=1;i<=count;i++)
			power=power*lastdigit;
				sum=sum+power;
				n=n/10;
		}System.out.println(sum);
		if(sum==n2)
		{
			System.out.println("Armstrong number");
		}else {
			System.out.println(" not armstrong");
		}

	}

}
