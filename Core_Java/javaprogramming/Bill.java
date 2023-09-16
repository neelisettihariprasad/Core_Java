package hari.javaprogramming;
import java.util.*;
public class Bill {
	private int billno;
	private float billamount;
	private float payableamt;
	private String description;
	private String customername;
	public float discount;
public void addbill() {
	Scanner key=new Scanner(System.in);
	System.out.println("enter billno");
	billno=key.nextInt();
	System.out.println(" enter customer name");
	customername=key.next();
	System.out.println(" enter description");
	description=key.next();
	System.out.println(" enter billamount");
	billamount=key.nextFloat();
}
public void calculate() {
	discount=(billamount*0.15f);
	payableamt=billamount-discount;
}
public void display() {
	System.out.println("enter billno\t" + billno);
	System.out.println("enter customername\t" +  customername);
	System.out.println("enter description\t" +  description);
	System.out.println("enter billamount\t" +  billamount);
	System.out.println("enter discount\t" + 
	discount);
	System.out.println("enter payableamt\t" + payableamt);
	
}

public static void main(String [] args) {
	Bill b=new Bill();
	b.addbill();
	b.calculate();
	b.display();
	
}
}
