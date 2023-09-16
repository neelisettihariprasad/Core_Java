package mainmethod;

public class Demo {
     public static void display() 
     {
    	 System.out.println(" main starts");
    	 int a=10;
    	 System.out.println(a);
    	 System.out.println("msin ends");
     }
     public void result()
     {
    	 System.out.println("main starts");
    	 double z=46.5;
    	 System.out.println(z);
    	 System.out.println("main ends");
     }
     public static void main (String [] args) 
     {
    	 System.out.println("main starts");
    	 display();
    	 Demo d1=new Demo();
    	 d1.result();
    	 System.out.println(" main ends");
     }
}