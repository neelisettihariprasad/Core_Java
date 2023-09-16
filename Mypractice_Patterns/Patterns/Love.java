package Patterns;

public class Love
{

	public static void main(String[] args) 
	{
		int space=8;
		int star=9;
		int spaace=11;
		for(int a=1;a<=2;a++)
		{
			for(int b=1;b<=space;b++)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=star;c++)
			{
				System.out.print("*");
			}
			for(int d=1;d<=spaace;d++)
			{
			    System.out.print(" ");	
			}
			for(int e=1;e<=star;e++)
			{
				System.out.print("*");
			}
			
			space=space-4;star=star+8;spaace=spaace-8;
			System.out.println( );
		}int spce=3;
		 int staar=40;
           for(int f=1;f<=2;f++)
           {
        	   for(int g=1;g<=spce;g++)
        	   {
        		   System.out.print(" ");
        	   }
        	   for(int h=1;h<=staar;h++)
        	   {
        		   System.out.print("*");
        	   }spce--;;staar=staar+2;System.out.println( );
           }int sppce=2;
           int str=42;
           int sttr=42;
           for(int i=1;i<=4;i++)
           {
        	   for(int j=1;j<=sppce;j++) {
        		   System.out.print(" ");
        	   }for(int k=1;k<=str;k++) {
        		   System.out.print("*");
        	   }
        	   System.out.println( );
           }for(int n=1;n<=21
        		   ;n++) {
           for(int l=1;l<=sppce;l++) {
        	   System.out.print(" ");
           }for(int m=1;m<=sttr;m++) {
        	   System.out.print("*");
           }sppce++;sttr=sttr-2;System.out.println( );
           }  
	}

}









