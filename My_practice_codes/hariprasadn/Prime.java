package hariprasadn;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         System.out.println(" enter min ");
         int min=scan.nextInt();
         System.out.println(" enter max");
         int max=scan.nextInt();
         for(int a=min;a<=max;a++) {
        	 int count=0;
        	 for (int i=min;i<=a;i++) {
        	 if (a%i==0) {
        		 count++;
        	 }
         }if (count==2) {
        	 System.out.println(a);
         }
	}
	}
}
