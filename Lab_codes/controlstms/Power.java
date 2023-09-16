package lab.controlstms;
import java.util.*;
public class Power {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int b,exp;
		long power=1;
			
		System.out.println("Enter the  base");
		b=sc.nextInt();
		System.out.println("Enter the  exponent");
		exp=sc.nextInt();
			 
		while(exp!=0)
		{
			power=power*b;
			exp--;
		}
		System.out.println(b+" to the power "+exp+"is "+power);
	    System.out.println("The value of the power : "+power);

	}

}
