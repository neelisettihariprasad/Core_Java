package lab.controlstms;

public class Threads {
	public static void main(String [] args) 
    {
		System.out.println("Start of Main");
            Thred_program o1 = new  Thred_program();
            Sec o2 = new Sec();

            o1.start();
            o2.start();

            System.out.println("End of Main");
            }

}
