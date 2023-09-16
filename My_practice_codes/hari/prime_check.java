package hari;

import java.util.Scanner;

public class prime_check {

	public static void main(String[] args) {
		int[] prime=new int[10];
		Scanner key=new Scanner(System.in);
		System.out.println("Enter 10 integer values");
		int i,c = 0,j;
		for(i=0;i<10;i++) {
			System.out.println("Prime["+i+"]");
			prime[i]=key.nextInt();
		
		for( j=2;j<prime[i];j++) {
			if(prime[i]%j==0) {
				c++;
				break;
			}else {
				c--;
			}
		}

	if(c==0) {
		System.out.println("prime number");
	}else {
		System.out.println("Not a prime number");
	}
	}}
}
