package hariprasad;

public class amstrongnumbers {

	public static void main(String[] args) {
		int x=1;
		int amstrongcount=1;
		while(amstrongcount<=20) {
			int temp=x;
			int count=0;
			while(x!=0) {
				count++;
				x=x/10;
			}x=temp;
			int sum=0;
			int lastdigit=0;
			while(x!=0) {
				lastdigit=x%10;
				int exponential=1;
				for(int a=1;a<=count;a++) {
					exponential=exponential*lastdigit;
				}sum=sum+exponential;
				 x=x/10;
		   }x=temp;
		   if(x==sum) {
			   System.out.println(x);
			   amstrongcount++;
		   }x++;
		   
		}

	}

}
