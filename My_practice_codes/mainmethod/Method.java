package mainmethod;
class Methodhari
{
	
	public static void display()
	{
		System.out.println("hari");
	}
	public void compile()
	{
		
		System.out.println("prasad");
	}
	
}
class Methodprasad
{
	public static int k=10;
	public int a=10;
}
public class Method
{
	public static void main(String[] args)
	{
		
	
		System.out.println(Methodprasad.k);
		Methodhari.display();
		Methodprasad m1=new Methodprasad();
		System.out.println(m1.a);
		Methodhari m2=new Methodhari();
		m2.compile();
	}
}