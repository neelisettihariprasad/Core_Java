package hariprasad;
import java.util.*;
 class Expo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(" enter num");
		int num=scan.nextInt();
		System.out.println("enger pow");
		int pow=scan.nextInt();
		int lastdigit=0;
		int sum=0;
		while(num!=0) {
			lastdigit=num%10;
			int exponential=1;
			for (int a=1;a<=pow;a++) {
			  exponential=exponential*lastdigit;	
			}sum=sum+exponential;
			 num=num/10;
		}System.out.println(sum);

	}

}
