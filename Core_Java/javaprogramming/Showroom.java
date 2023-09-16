package hari.javaprogramming;
import java.util.*;
public class Showroom {
	String name;
	long mn;
	float am,disc,payable;
public Showroom(String na,long m,float a, float dis, float pay) {
	name=na;
	mn=m;
	am=a;
	disc=dis;
	payable=pay;
	System.out.println("name"+name+"\n"+"mobilenumber"+mn+"\n"+"amount"+am+"\n"+"disc"+disc+"\n"+"payable"+pay);
	
}
public Showroom()
{
	name ="hari";
	mn=630553036;
	am=10000;
	disc=am*0.15f;
	payable=8500;
	System.out.println("name"+name+"\n"+"mobilenumber"+mn+"\n"+"amount"+am+"\n"+"disc"+disc+"\n"+"payable"+payable);
}
public void readinput() {
	Scanner key=new Scanner(System.in);
	System.out.println(" enter name");
	name=key.next();
	System.out.println(" enter mobile number");
	mn=key.nextLong();
	System.out.println(" enter amount");
	am=key.nextFloat();
	System.out.println(" enter discount");
	disc=key.nextFloat();
	System.out.println(" enter payable");
	payable=key.nextFloat();
}
public float calculate() {
	if(am<=20000) {
		disc=am*(5/100);
		System.out.println(disc);
	}else if(am>20000 &  am<35000) {
		disc=am*(10/100);
		System.out.println(disc);
		
	}else {
		disc=am*(15/100);
		System.out.println(disc);
	}
	return disc;
}
public void display() {
	System.out.println(name);
	System.out.println(mn);
	System.out.println(am);
	System.out.println(disc);
	System.out.println(payable);
	
}

	

}

