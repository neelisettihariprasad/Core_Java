package lab.controlstms;
import java.util.*;
public class Series_sum {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int num;
		float x,sum=0;
	    System.out.println("Program to find of x-1/x+2/x-3/x….n/x");
		System.out.println("Enter x value");
		x=obj.nextFloat();
		System.out.println("Enter num value");
		num=obj.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
				sum=sum-(float)i/x;
			else
			    sum=sum+(float)i/x;;
					
		}
				
		System.out.println("series sum is"+sum);
	}			
	}


