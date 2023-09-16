package hari;
import java.util.ArrayList;
import java.util.Arrays;
public class Myiterator {

	public void addmore(ArrayList l1) {

		l1.add("We");

		}

		public static void main(String[] args) {

		ArrayList <String>als = new ArrayList<String>();

		als.add("I");

		als.add("You");

		Myiterator obj = new Myiterator( );

		obj.addmore(als);

		System.out.println(als);

		}

}
