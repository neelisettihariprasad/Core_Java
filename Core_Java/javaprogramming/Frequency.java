package hari.javaprogramming;
import java.util.*;
public class Frequency {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        // Finding the frequency of each element
       int[] frequency = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            
           frequency[i] = count;
        }
     // Printing the frequency of each element
        System.out.println("\nElement Frequency:");
        for (int i = 0; i < n; i++) {
            if (frequency[i] != 0) {
                System.out.println(arr[i] + " frequency " + frequency[i]);
                
            }
        }

	}

}
