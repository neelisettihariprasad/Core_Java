package collection.test;
import java.util.*;
public class Vectors {

	public static void main(String[] args) {
          Book obj[] = new Book[5];
		
		obj[0]= new Book("1","java", "james", 350f);
		obj[1]= new Book("2","C", "Dennis Ritch", 500f);
		obj[2]= new Book("3","python ", "Rossum", 300f);
		obj[3]= new Book("4","AI", "Jegan", 800f);
		obj[4]= new Book("5","Html", "Hari", 2000f);
		
		Vector<Book> v = new Vector<Book>();
		
		v.add(obj[0]);
		v.add(obj[1]);
		v.add(obj[2]);
		v.add(obj[3]);
		v.add(obj[4]);
		
		for(Book b : v) {
			
			System.out.println(b.bookid +" "+ b.booktitle + " "+b.author +" "+b.price);
		}
		
		

	}

}
