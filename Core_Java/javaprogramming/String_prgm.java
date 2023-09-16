package hari.javaprogramming;

public class String_prgm {
	public static void main(String[] args) {
		int count=0;
		char ch;
		int a=0;
		int d=0;
		int spa=0;
		int special=0;
		String sub="robust";
		String s= "Java 18 is a robust language";
		for(int i=0;i<s.length();i++) {
			ch=s.charAt(i);
			if(ch>='a'&&ch<='z' || ch>='A'&&ch<='Z' ) {
				a++;
			}else if(ch>='0'&& ch<='9') {
				d++;
			
		}else if(ch==' ') {
			spa++;
		}else {
			special++;
		}
		}
		System.out.println(" Count of aphabets : "+a);
		System.out.println(" Count of digits :"+d);
		System.out.println(" Count of number of words : "+spa);
		System.out.println(" Count of special charecters : "+special++);
		System.out.println(s.contains(sub));
	}
	

}
