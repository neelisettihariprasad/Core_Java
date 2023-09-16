package hari.javaprogramming;

public class childs extends Parents{
	public void method(){
		System.out.println("Hi i am Child");
		}
		public static void main(String args[]){
		childs child = new childs();
		child.method();
		}
}
