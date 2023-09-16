package hariprasad;

public class primenumers {

	public static void main(String[] args) {
		int x=1;
		int palindromecount=1;
		while(palindromecount<=100) {
			int rev=0;
			int temp=x;
			int lastdigit=0;
			while(x!=0) {
				lastdigit=x%10;
				rev=rev*10+lastdigit;
				x=x/10;
			}x=temp;
			if(rev==temp) {
				System.out.println(x);
				palindromecount++;
			}x++;
		}

	}

}
