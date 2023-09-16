package Threads;

public class Thraed2 extends Thread1{
	public void run() {
        try {
            Thread.sleep(1000);  
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 2; i <= 100; i += 2) {
            System.out.println("Even number: " + i);
        }
    }

}
