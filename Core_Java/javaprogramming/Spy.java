package hari.javaprogramming;

public class Spy {
	public static void main(String[] args) {
		int n=1124;
		int lastdigit;
		int sum=0;
		int product=1;
		while(n!=0) {
			lastdigit=n%10;// 1124/10= 4
			sum=sum+lastdigit; // 0+ 4 
			product=product*lastdigit; // 1*4=4
			n=n/10;
		}if(sum==product) {
			System.out.println(" given number is spy");
		}else {
			System.out.println(" given number is not spy ");
		}

	}


}

