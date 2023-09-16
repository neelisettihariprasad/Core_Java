package Patterns;

public class PTT 
{

	public static void main(String[] args) 
	{
		int star=1;
		for(int i=1;1<=9;i++) {
	    for(int a=1;a<=star;a++) {
	    	 System.out.print("*");
	    }if(i>=5) {
	    	star--;
	    }else {
	    	star++;
	    }System.out.println( );
	    }
}
}
