package Patterns;

public class gsgs {

	public static void main(String[] args) {
		int space=2;
		int star=1;
		char x='a';
		for(int i=1;i<=5;i++) {
			for(int a=1;a<=space;a++) {
				System.out.print("   ");
			}for(int b=1;b<=star;b++) {
				System.out.print(" "+x+" ");
			}if(i>=3) {
				space++;
				star=star-2;
				x--;
			}else {
				space--;
				star=star+2;
				x++;
			}System.out.println( );
		}
	}

}
