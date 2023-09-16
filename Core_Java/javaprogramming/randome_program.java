package hari.javaprogramming;
import java.util.Random;
import java.util.Scanner;
public class randome_program {
	public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
 
        int r = random.nextInt(100);
        int num;
        System.out.println("Print random number:"+ r);

       do {
            System.out.print("Enter your guess: ");
            num = scanner.nextInt();

            if (num < r) {
                System.out.println("Your input is Too low!! repeat again");
            } else if (num > r) {
                System.out.println("Your input is Too high!! repeat again");
            }
        } while (num != r);

        System.out.println("Congratulations! our input number is eual to random number: " + r);
    

       }
}
