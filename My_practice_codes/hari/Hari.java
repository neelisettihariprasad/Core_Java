package hari;

public class Hari implements Runnable {
	
	    private String message;

	    public Hari(String message) {
	        this.message = message;
	    }
	    public void run() {
	        for (int i = 0; i < 5; i++) {
	            System.out.println(Thread.currentThread().getId() +"(TID)"+ ": " + message);
	            try {
	                Thread.sleep(100); // Optional delay to increase interleaving chances
	            } catch (Exception e) {
	                System.out.println(e);
	            }
	        }
	    }
	
}
