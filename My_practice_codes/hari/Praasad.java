package hari;

public class Praasad implements Runnable{
	private String message;

    public Praasad(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
            try {
                Thread.sleep(100); // Optional delay to increase interleaving chances
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
	

