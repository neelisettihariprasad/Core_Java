package hari;

public class Priority {

	public static void main(String[] args) {
		Thread Thread1 = new Thread(new har(), "Low Priority Thread");
        Thread Thread2 = new Thread(new har(), "Normal Priority Thread");
        Thread Thread3 = new Thread(new har(), "High Priority Thread");

        // Set thread priorities
        Thread1.setPriority(Thread.MIN_PRIORITY);
        Thread2.setPriority(Thread.NORM_PRIORITY);
        Thread3.setPriority(Thread.MAX_PRIORITY);

        Thread1.start();
        Thread2.start();
        Thread3.start();
	}

}
