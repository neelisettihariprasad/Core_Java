package hari;

public class Rose implements Runnable{
	static Thread t1, t2;

	public void run() {

	for(int i=0; ;){

	System.out.println(Thread.currentThread().getName());

	i++;

	}

	}
		public static void main(String ar[]) {

			Rose t=new Rose();

			t1=new Thread(t, "T1");

			t2=new Thread(t, "T2");

			try{ t1.start();

			t1.sleep(5000);

			}catch(Exception e){ }

			t2.start();

			}

}
