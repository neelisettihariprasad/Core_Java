package lab.controlstms;
import java.util.*;
public class Rev_digits {

	public static void main(String[] args) {
		Scanner key= new Scanner(System.in);
		
		 int num, r, reverse=0;
					
		 System.out.println("Enter a number");
					
		 num = key.nextInt();
		 
		 while(num>0)
		 {
			r=num%10;
			reverse= (reverse*10) +r;
			System.out.print(r);
			num/=10;
		 }
					
		 System.out.println("reverse of the digits : "+ reverse);
	}

}
