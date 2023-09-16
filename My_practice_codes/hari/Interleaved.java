package hari;

public class Interleaved {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new Hari("Thread 1"));
        Thread thread2 = new Thread(new Hari("Thread 2"));

        thread1.start();
        thread2.start();
	}

}
