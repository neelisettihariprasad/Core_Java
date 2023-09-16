package hari.javaprogramming;

import java.util.Scanner;

public class Arrays
{

	public static void main(String[] args)
	{
		int [] numbers;
		Scanner key=new Scanner(System.in);
		int[] array;
		int i,size;
		float sum=0,avg;
		System.out.println(" enter numbers");
		size=key.nextInt();
		array=new int[size];
		System.out.println(size);
		for(i=0;i<size;i++) {
			array[i]=key.nextInt();
			sum=sum+array[i];
			
		}
		avg=sum/size;
		System.out.println("highest avg");
		for(i=0;i<size;i++)
		{
			if(array[i]>avg)
				System.out.println(array[i]);
		}
	}

}
