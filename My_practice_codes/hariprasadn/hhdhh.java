package hariprasadn;

public class hhdhh {
	public static void main(String[] args) {
				/*int a=20;
				String b=(a%2==0)?"even":"odd";
				System.out.println(b);*/
		int count=0;
		for(int a=1;a<=1000;a++) {
			int sum=0;
			for(int b=1;b<a;b++) {
				if(a%b==0) {
					sum=sum+b;
				}
			}if ( sum==a) {
				count++;
				System.out.println(a);
			}
		}System.out.println(count);

	}

}
