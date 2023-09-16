package lab.controlstms;
import java.util.*;
import java.util.regex.*;
public class Regular_Exp {
public static void main(String[] args) {
		// TO READ THE INPUT FROM SYSTEM
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name consists of 5 charecters");
		System.out.println("Enter ID number");
		String id= sc.next();
		System.out.println("Enter Name");
		String name= sc.next();
		System.out.println("Enter 10 digit Mobile number");
		String mobile= sc.next();
		if(Pattern.matches("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d", mobile))
			System.out.println("valid mobile number");
		else
			System.out.println("Invalid mobile number");

		
}
}
