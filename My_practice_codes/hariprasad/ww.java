package hariprasad;

public class ww {

	public static void main(String[] args) {
		int num=12;
		int pow=2;
		int sum=0;
		int lastdigit=0;
		while(num!=0) {
			lastdigit=num%10;
			int exponential=1;
			for(int a=1;a<=pow;a++) {
				exponential=exponential*lastdigit;
			}sum=sum+exponential;
			num=num/10;
		}System.out.println(sum);

	}

}
