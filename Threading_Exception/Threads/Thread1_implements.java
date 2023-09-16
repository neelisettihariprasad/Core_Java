package Threads;

public class Thread1_implements {

public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
        Thraed2 t2 = new Thraed2();
        t1.start();
        t2.start();
    }

	}


