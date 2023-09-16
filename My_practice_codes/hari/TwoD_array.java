package hari;
import java.util.Arrays;
import java.util.Scanner;
public class TwoD_array {
	public static void main(String[] args) {
		String [] bookid=new String[2];
		String [] booktitle=new String[2];
		String [] author=new String[2];
		float [] price=new float[2];
		Scanner key=new Scanner(System.in);
		System.out.println("Enter 5 records");
		for(int i=0;i<bookid.length;i++) {
			 bookid[i]=key.next();
			 booktitle[i]=key.next();
			 author[i]=key.next();
			 price[i]=key.nextFloat();		
			 //System.out.println(bookid[i]+"\n"+booktitle[i]+"\n"+author[i]+"\n"+price[i]);
		}
		for(int i=0;i<bookid.length;i++)
			System.out.println(bookid[i]+"\n"+booktitle[i]+"\n"+author[i]+"\n"+price[i]);
		String bkid=key.next();
		
		for(int i=0;i<bookid.length;i++) {
			
		if(bkid.equals(bookid[i])) {
			
			System.out.println(bookid[i]+"\n"+booktitle[i]+"\n"+author[i]+"\n"+price[i]);
		}else {
			
			System.out.println("record not found");
		//System.out.println(bookid[i]+"\n"+booktitle[i]+"\n"+author[i]+"\n"+price[i]);
		}
		}	
	} 		
		
	}


