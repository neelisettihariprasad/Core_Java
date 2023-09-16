package hari.javaprogramming;
import java.util.*;
public class compare {
	private String[] stringArray;
    private int n;

    public void Compare(int n) {
        Scanner key=new Scanner(System.in);
		n=key.nextInt();
        String[] hari = new String[n];
    }

    public void ConvertTo(String[] strings, int n) {
        for (int i = 0; i < n; i++) {
            String originalString = strings[i];
            String convertedString = convertFirstLetterToCapital(originalString);
            stringArray[i] = convertedString;
        }
    }

    private String convertFirstLetterToCapital(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        char[] charArray = str.toCharArray();
        charArray[0] = Character.toUpperCase(charArray[0]);
        return new String(charArray);
    }

    public void display() {
        for (String str : stringArray) {
            System.out.println(str);
        }
    }
}