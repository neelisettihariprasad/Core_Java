package hari.javaprogramming;
import java.util.*;
public class Rectangle {
	private float width;
	private float height;
public  void Getval() {
	Scanner key=new Scanner(System.in);
	System.out.println(" enter width");
	width=key.nextFloat();
	System.out.println("enter height");
	height=key.nextFloat();
}
public float areaofrectangle() {
	float area;
	area=(width*height);
	return area;
	
}
public static void main(String [] ar) {
	Rectangle r=new Rectangle();
	r.Getval();
	r.areaofrectangle();
	System.out.println("area of rectangle is:" + r.areaofrectangle());
}

}
