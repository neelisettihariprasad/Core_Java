package Threads;

public class Imp {

	public static void main(String[] args) {
		Ex_Thread2  t=new Ex_Thread2();
		Har h = new Har();
		t.setPriority(Thread.MIN_PRIORITY);
		h.setPriority(Thread.MAX_PRIORITY);
		t.start();
		h.start();
	}

}
