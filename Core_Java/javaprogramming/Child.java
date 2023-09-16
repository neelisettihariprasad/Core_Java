package hari.javaprogramming;

public class Child extends Parent{
	public void method(){
		System.out.println("Hi i am Child");
	}
	public static void main(String args[]){
		Child child = new Child();
		child.method();
		}
}
