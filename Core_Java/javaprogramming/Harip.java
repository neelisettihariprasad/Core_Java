package hari.javaprogramming;
import java.util.*;
public class Harip {

	public static void main(String args[]) {
		String hari="welcome=,to=,anudip=,organisation";
		StringTokenizer h= new StringTokenizer(hari,"=,");
		while (h.hasMoreTokens())
			System.out.println( h.nextToken());
			
	}
}

