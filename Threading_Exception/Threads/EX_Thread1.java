package Threads;
public class EX_Thread1 extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(1000);
			}catch(Exception hari) {
				System.out.println(hari);
			}System.out.println("Thread 1 " +i);
		}
	}
public static void main(String[] args) {
	EX_Thread1 t = new EX_Thread1();
	t.start();
	for(int j=1;j<=10;j++) {
		try {
			Thread.sleep(1000);
		}catch(Exception hari) {
				
			System.out.println(hari);
		}System.out.println("Thread 2 " +j);
	}	
}

}
