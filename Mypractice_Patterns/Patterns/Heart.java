package Patterns;

public class Heart 
{
	public static void main(String [] args)
	{
	 int space=4;
     int star=7;
     int u=6;
     for(int i=1;i<=5;i++)
     {
    	 for(int a=1;a<=space;a++)
    	 {
    		 System.out.print(" ");
    	 }
    	 for(int b=1;b<=star;b++)
    	 {
    		 System.out.print("A");
    	 }
    	 for(int c=1;c<=space;c++)
    	 {
    		 System.out.print("  ");
    	 }
    	 for(int d=1;d<=u;d++)
    	 {
    		 System.out.print("A");
    	 }
    	 space--;star=star+2;u=u+2;System.out.println( );
     } 
   
     
     int z=0;
     int y=29;
     for(int e=1;e<=15;e++)
     {
    	 for(int f=1;f<=z;f++)
    	 {
    		 System.out.print(" ");
    	 }
    	 for(int g=1;g<=y;g++)
    	 {
    		 System.out.print("B");
    	 }
    	 z++;
    	 y=y-2;
    	 System.out.println( );
     }
}		 
}	 


