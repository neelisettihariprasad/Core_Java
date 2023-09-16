package hari.javaprogramming;

import java.util.Scanner;

public class Hello 
{

	public static void main(String[] args)
	{
		String student_name;
		float avgmarks;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student name");
		student_name=sc.next();
		System.out.println("enter avg marks");
		avgmarks=sc.nextInt();	
		if (avgmarks>=80){
			System.out.println(" grade A+");
		}
		else if ( avgmarks<=60 & avgmarks>80){
			System.out.println(" grade A");
		}
		else if (avgmarks<=50 & avgmarks>=59){
			System.out.println(" grade C");
	   }else {
		   System.out.println("need improvement"+ "");
	   }

}
}