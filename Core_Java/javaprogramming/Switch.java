package hari.javaprogramming;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		System.out.println("1. Find Factorial of a number");
        System.out.println("2. Check for Armstrong or not");
        System.out.println("3. Check for perfect number");
        System.out.println("4. EXit the loop");
        System.out.print("Enter your choice: ");
		 int choice;
        Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();

        switch (choice) {
            case 1:
            {
            	int i,n;
                long fact=1,factsum=0;
                  Scanner key=new Scanner(System.in);
                 System.out.println("Enter the n value");
                 n=key.nextInt();
                 
                 for (i=1;i<=n;i++)
                    {
       	            fact=(fact*i);
       	            factsum=factsum+fact;
                    }
                 System.out.println( n + factsum);
                 break;
            }
            case 2:
            {
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
            case 3:
            {
            	Scanner key=new Scanner(System.in);
        		int n,i,sum=0;
        		
        		System.out.println("Enter the number");
        		n=key.nextInt();
        		
        		for(i=1;i<n;i++)
        		{
        		   if(n%i==0)
        		   {
        			   System.out.println(i);
        			   sum =sum+i;
        		   }
        		}
        		if(sum==n)
        		{
        			System.out.println("It is a perfect number");
        		}
        		else
        		{
        			System.out.println("It is not a perfect number");
        		}
        		break;
            }
            case 4:
            {
            	System.out.println("Program ended");
    			System.exit(choice);
            }
            default:{
    			System.out.println("Invalid Choice");
            }
        }

	}

}
