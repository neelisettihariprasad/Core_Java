package collection.test;
import java.util.*;
public class Hash_table {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put("Harrypotter","Fantasy");
		ht.put("Dracula","Horror");
		ht.put("Twostates","Romance");
		ht.put("Vanguidorossum","python");
		ht.put("Murder","Crime");
		ht.put("The higgler","Romance");
		ht.put("Valmiki","Ramayan");
		ht.put("Hari","coding");
		ht.put("Omrauth","Modern Ramayan");
		ht.put("Rajamouli","RRR");
		Enumeration e = ht.keys();
		while (e.hasMoreElements())
		{
		String key = (String) e.nextElement();
		Object value = ht.get(key);
		System.out.println(key + " - " + value);
		}

	}

}
