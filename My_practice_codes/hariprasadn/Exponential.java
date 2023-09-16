package hariprasadn;

import java.util.Scanner;

public class Exponential {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(" enter base");
		int base=scan.nextInt();
		System.out.println(" enter power");
		int power=scan.nextInt();
		int exponential=1;
		for(int a=1;a<=power;a++) {
			exponential=exponential*base;
		}System.out.println(exponential);

	}

}
