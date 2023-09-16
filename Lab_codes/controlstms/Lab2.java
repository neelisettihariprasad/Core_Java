package lab.controlstms;
import java.util.*;
public class Lab2 {

	public static void main(String[] args) {
		Scanner key=new Scanner(System.in);
		System.out.println(" Enter a string");
		String s=key.nextLine();
		int alpha,digit,symbol,space,word;
		char ch;
		alpha=digit=symbol=space=word=0;
		for(int i=0;i<s.length();i++) {
			ch=s.charAt(i);
			if(Character.isAlphabetic(ch))
				alpha++;
			else if(Character.isDigit(ch))
				digit++;
			else if(Character.isWhitespace(ch))
				space++;
			else
				symbol++;
		}word=space+1;
		System.out.println("No of alphabets : "+alpha);
		System.out.println("No of digits : "+digit);
		System.out.println("No of spaces : "+space);
		System.out.println("No of symbols : "+symbol);

        System.out.println(" Enter sub string");
        String s1=key.nextLine();
        if(s.contains(s1))
        	System.out.println("My sub string is present");
	}

}
