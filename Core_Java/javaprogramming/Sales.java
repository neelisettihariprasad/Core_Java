package hari.javaprogramming;
import java.util.*;
public class Sales {

	public static void main(String[] args) {
		String uesrid; 
		int sv,date;
		Scanner key = new Scanner(System.in);
		System.out.println("Enetr user Id");
		String userid=key.next();
		System.out.println(" enter sales value");
		sv=key.nextInt();
		System.out.println(" enter date");
		date=key.nextInt();
		if (date>=1 & date<=15)
		{
			
		    if (sv <= 50000){
			System.out.println(" The Commision is zero");
		    }
		    else if (sv >= 50000){
			System.out.println(" The Commision is 8%");
		    }
		    else if (sv >= 100000){
			System.out.println(" The Commision is 15%");
		    }
		}else {
			if (sv <= 50000){
				System.out.println(" The Commision is zero");
			    }
			    else if (sv >= 50000){
				System.out.println(" The Commision is 6%");
			    }
			    else if (sv >= 100000){
				System.out.println(" The Commision is 12%");
			    }
		}
	}

}
