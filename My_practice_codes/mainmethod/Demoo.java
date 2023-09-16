package mainmethod;

public class Demoo 
{
	public static String brand="HONDA";
	public String series;
	public int speed;
	public int distance;
	public Demoo (String a,int b,int c)
	{
		series=a;
		speed=b;
		distance=c;
	}
	public void time()
	
	{
		int t=distance/speed;
		System.out.println(brand+series+t);
	}
	public static void main(String [] args)
	{
		Demoo d1=new Demoo("A4",200,600);
		Demoo d2=new Demoo("Q4",100,200);
		d1.time();
		d2.time();
		
	}
	
}
