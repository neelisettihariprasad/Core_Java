package hariprasadn;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter minrange");
		int minrange=scan.nextInt();
		System.out.println("enter maxrange");
		int maxrange=scan.nextInt();
		int count=0;
		for(int a=minrange;a<=maxrange;a++) {
			if(a%2==0) {
				count++;
			}System.out.println(count);
		}if(count==2) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
	}

}
