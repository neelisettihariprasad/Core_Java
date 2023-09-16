package hari.javaprogramming;

import java.util.Scanner;

public class Display_numbers {

	public static void main(String[] args) {
		Scanner key=new Scanner(System.in);
		long a;
		int fact=1;
		System.out.println(" enter a number");
		a=key.nextInt();
		for(int i=1;i<=a;i++) {
			fact=fact*i;
			System.out.println(a +"!" + "=" +fact);
		}
	}

}
