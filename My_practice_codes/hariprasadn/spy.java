package hariprasadn;

public class spy {

	public static void main(String[] args) {
		int n=124;
		int sum=0;
		int product=1;
		int lastdigit=0;
		while(n!=0) {
			lastdigit=n%10;
			sum=sum+lastdigit;
			product=product*lastdigit;
			n=n/10;
		}if(sum==product) {
			System.out.println("spy");
		}else {
			System.out.println(" not spy ");
		}

	}

}
