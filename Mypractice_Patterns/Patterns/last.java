package Patterns;

public class last {

	public static void main(String[] args) {
		int star=1;
		int space=8;
		for(int i=1;i<=9;i++) {
			for(int a=1;a<=star;a++) {
				System.out.print("*");
			}for(int b=1;b<=space;b++) {
				System.out.print(" ");
			}for(int c=1;c<=star;c++) {
				System.out.print("*");
			}if(i>=5) {
				star--;
				space=space+2;
			}else {
				star++;
				space=space-2;
			}System.out.println( );
		}

	}

}
