package hariprasadn;

import java.util.Scanner;

public class perfect_number {

	public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println(" enter num ");
      int num=scan.nextInt();
      int count=0;
      for(int a =1;a<=num;a++) {
    	  if(num%a==0) {
    		  count++;
    	  }System.out.println(count);
      }if(count==2) {
    	  System.out.println("prime number");
      } else {
    	  System.out.println("not a prime number");
      }

	}

}
