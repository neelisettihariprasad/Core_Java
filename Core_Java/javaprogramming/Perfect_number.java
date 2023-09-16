package hari.javaprogramming;

import java.util.Scanner;

public class Perfect_number {

	public static void main(String[] args) {
		Scanner key=new Scanner(System.in);
		int sum=0;
		long a;
		System.out.println(" enter a number");
        a=key.nextInt();
        for(int i=1;i<a;i++) {
        	if(a%i==0) {
        	 sum=sum+i;
        	}
        }if(sum==a) {
        	System.out.println("perfect number");
        }else {
        	System.out.println(" not a perfect number");
        }
     }
}


