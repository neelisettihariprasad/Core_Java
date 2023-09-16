package Threads;
import java.util.*;
public class Plindrome_check {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        if(isPalindrome(str)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");

	    }

	}
	public static boolean isPalindrome(String str) {
        int length = str.length();
        System.out.println(length);
        int j=length-1;
        for(int i=0;i<j;j--) {

            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
        }

        return true;
    }
}
