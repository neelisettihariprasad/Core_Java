package hariprasadn;

import java.util.Scanner;

public class power_count {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(" enter num ");
		int num=scan.nextInt();
		System.out.println(" enter power");
		int power=scan.nextInt();
		int sum=0;
		int lastdigit=0;
		while (num!=0) {
			lastdigit=num%10;
			int exponential=1;
			for(int a=1;a<=power;a++) {
				exponential=exponential*lastdigit;
			}sum=sum+exponential;
			 num=num/10;
		}System.out.println(sum);

	}

}
