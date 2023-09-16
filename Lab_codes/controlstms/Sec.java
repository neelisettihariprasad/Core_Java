package lab.controlstms;

public class Sec extends Thread{
	public void run() {
		int fact=1;
	    for (int i=1;i<=10;i++)
	    {
	    	fact=(fact*i);
	    }
	    System.out.println("10! is :"+fact);

	}

}
