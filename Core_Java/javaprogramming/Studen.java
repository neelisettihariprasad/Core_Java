package hari.javaprogramming;
import java.util.*;
public class Studen {
	public  void display() throws Exception {
		Scanner key=new Scanner(System.in);
		System.out.println("Enter id number and name");
		 
		int s1=key.nextInt();
		String s2=key.next();
		 
		 System.out.println("Id number is: "+ s1 +"Name is: " + s2);
	}
	public static void main(String[] args) throws Exception{
		Studen o = new Studen();
		try {
			o.display();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
