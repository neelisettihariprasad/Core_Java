package hariprasad;

public class Amstrong {

	public static void main(String[] args) {
		int num=153;
		int temp=num;
		int count=0;
		int lastdigit=0;
		int sum=0;
		while(num!=0) {
			count++;
			num=num/10;
		}System.out.println(count);
		lastdigit=num%10;
		int exponential=1;
		for(int a=1;a<=count;a++) {
			exponential=exponential*lastdigit;
		}  sum=sum+exponential;
		   num=num/10;
         if(temp==sum) {
        	 System.out.println(" amstrong number");
         } else {
        	 System.out.println("not a amstrong number");
         }
	}

}
