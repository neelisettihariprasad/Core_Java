package hari.javaprogramming;

public class Sample {

	
	public static void main(String[] args) {

		Sample obj= new Sample();
		System.out.println(obj.hashCode());
		obj=null;
		//calling of garbage collector
		System.gc(); // to clear all objects from memory
		System.out.println("End of garbage collection");
	}
    protected void finalize() { // To represent an object be cleared by Garbage collector
    	System.out.println("Finalized method called");
    }
}
