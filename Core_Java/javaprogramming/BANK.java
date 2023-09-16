package hari.javaprogramming;
import java.util.*;
import java.util.Scanner;

public class BANK {

	public static void main(String[] args) {
		System.out.println("1. Add account");
        System.out.println("2. deposit");
        System.out.println("3. withdraw");
        System.out.println("4. balance");
        System.out.println(" 5. exit");
        System.out.print("Enter your choice: ");
		 int choice;
        Scanner sc = new Scanner(System.in);
         long acno ;
    	 String cname, actype;
          float deposit, withdraw, balance = 0;

		choice = sc.nextInt();
        switch (choice) {
        case 1:
        {
        	Scanner obj = new Scanner(System.in);
    		System.out.println("Enter account Number ");
    		acno=obj.nextLong();
    		System.out.println("Enter customername");
    		cname=obj.next();
    		System.out.println("Enter accountype (Sa or Ca)");
    		actype=obj.next();
    		balance=0;

        }
        case 2:
        {
        	Scanner obj = new Scanner(System.in);
    		System.out.println("Enter account Number for deosit");
    		acno=obj.nextLong();
    		System.out.println("Enter customer Name");
    		cname=obj.next();
    		System.out.println("Enter Account Type (Sa or Ca)");
    		actype=obj.next();
    		System.out.println("Enter Deposit amount");
    		deposit=obj.nextFloat();
    		balance = balance + deposit;
    		

        }
        case 3:
        {
        	Scanner obj = new Scanner(System.in);
    		System.out.println("Enter account Number for withdral ");
    		acno=obj.nextLong();
    		System.out.println("Enter customer Name");
    		cname=obj.next();
    		System.out.println("Enter Account Type (Sa or Ca)");
    		actype=obj.next();
    		System.out.println("Enter customer Name");
    		cname=obj.next();
    		System.out.println("Enter Withdraw amount");
    		withdraw=obj.nextFloat();
    		if(withdraw<balance)
    		{
    			balance-=withdraw;
    			System.out.println("Transaction completed...");
    		}
    		else 
    		{		
        System.out.println("Insufficient Balance");
    		}
        }
        case 4:
        {
        	long accno;
        	String cuname,acctype;
        	
        	Scanner key=new Scanner(System.in);
        	System.out.println(" enter account number");
        	accno=key.nextLong();
        	System.out.println(" enter Customer name");
        	cname=key.next();
        	System.out.println(" enter account type");
        	acctype=key.next();
        	System.out.println("\nCheck balance\naccount number "+ accno);
    		System.out.println("Customer Name "+ cname);
    		System.out.println("Accont Type "+ acctype);
    		System.out.println("Balance amount "+ balance);

        }
        case 5:
        {
        	System.out.println("Program ended");
			System.exit(choice);
        }
        default:{
			System.out.println("Invalid Choice");
        }
        }

	}

	}


