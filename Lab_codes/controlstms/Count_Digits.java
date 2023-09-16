package lab.controlstms;

public class Count_Digits {

	public static void main(String[] args) {
		 int c=0, n=1431;

		    while (n != 0) 
		    {
		      n /= 10;
		      ++c;
		 }

		 System.out.println("Number of digits: " + c);
	}

}
