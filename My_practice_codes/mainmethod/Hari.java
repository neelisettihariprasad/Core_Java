package mainmethod;

public class Hari 
{
	public static void display()
	{
		int a=5;
		System.out.println(a);
	}
	public void result()
	{
		int a=10;
		System.out.println(a);
	}
	public static void main(String [] args)
	{
		System.out.println(" hari starts ");
		display();
		Hari h1=new Hari();
		h1.result();
		System.out.println(" hari ends ");
	}

}
