package Threads;

public class Ex_Thread2 extends Thread
{
	public void run() {
	for(int i=1;i<=5;i++) {
		System.out.println("i = " +i);
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			System.out.println(e);
		}System.out.println("End of first");
	}

	}
}
