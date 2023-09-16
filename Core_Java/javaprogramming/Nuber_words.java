package hari.javaprogramming;
import java.util.*;
public class Nuber_words {

	public static void main(String[] args) {
		String roll="193",nam="hari",con_number,mailid,qual;
		String rollno,name;
		Scanner key=new Scanner(System.in);
		System.out.println(" enterr roll no,name,mailid,contactnumber");
		rollno=key.next();
		name=key.next();
		mailid=key.next();
		con_number=key.next();
		qual=key.next();
		if(mailid.contains("@gmail.com")) 
			System.out.println("valid gmail");
		else
			System.out.println("invalid gmail");
		if(con_number.length()==10)
			System.out.println("valid mobile number");
		else
			System.out.println("invalid mobile number");
		if(rollno==roll & name==nam)
			System.out.println(" registration succesfull");
		else
			System.out.println(" registration failed");

	}

}
