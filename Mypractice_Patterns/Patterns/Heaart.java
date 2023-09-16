package Patterns;

public class Heaart
{
  public static void main (String [] args )
  {
	  int space=2;
	  int star=3;
	  int e=4
			  ;
	  for(int i=1;i<=3;i++)
	  {
		  for(int a=1;a<=space;a++)
		  {
			  System.out.print(" ");
		  }
		  for(int b=1;b<=star;b++)
		  {
			  System.out.print("*");
		  }
		  for(int c=1;c<=e;c++)
		  {
			  System.out.print(" ");
		  }
		  for(int d=1;d<=star;d++)
		  {
			  System.out.print("*");
		  }
		  space--;star=star+2;e=e-2;System.out.println( );
	  }
	  for(int f=1;f<=4;f++)
	  {
		  for(int g=1;g<=14;g++)
		  {
			  System.out.print("*");
		  }
		  System.out.println( );
	  }
	  int z=1;
	  int y=12;
	  for(int x=1;x<=6;x++)
	  {
		  for(int v=1;v<=z;v++)
		  {
			  System.out.print(" ");
		  }
		  for(int u=1;u<=y;u++)
		  {
			  System.out.print("*");
		  }
		  z++;y=y-2;
		  System.out.println( );
	  }
  }
}
