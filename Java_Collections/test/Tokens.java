package collection.test;
import java.util.Enumeration;
import java.util.*;
public class Tokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "Java is platform independent";
        StringTokenizer st = new StringTokenizer(s," ");
        while(st.hasMoreTokens()) {
        	System.out.println(st.nextToken());
        }
        while (st.hasMoreTokens()) {
			String key = (String)st.nextToken();
			System.out.println("Key: " + key  );

        
        }
        
	}

}
