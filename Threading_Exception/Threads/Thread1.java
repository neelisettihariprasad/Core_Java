package Threads;

public class Thread1 extends Thread {
	public void run() {
		try {
			
        for (int i=1; i<=100; i+=2) {
            System.out.println("Odd number: " + i);
        }
        }catch(Exception e) {
        	System.out.println("To avoid this try block and Execute remaing program");
        }
    }
}

