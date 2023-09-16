package hariprasadn;

public class amstrong_number {
	public static void main(String[] args) {
		int num=153;
		int temp=num;
		int count=0;
		while(num!=0) {
			count++;
			num=num/10;
		}System.out.println(count);
		int sum=0;
		int amsum=0;
		int lastdigit=0;
		temp=num;
		while(num!=0) {
		lastdigit=num%10;
		int exponential=1;
		for(int a=1;a<=count;a++) {
			exponential=exponential*lastdigit;
		}sum=sum+exponential;
		 amsum=amsum+lastdigit;
		 num=num/10;
		}
		if ( sum==temp) {
			System.out.println(temp+"amstrong");
	        System.out.println(amsum);
		}
		int c=amsum;
		int rev=0;
		int middledigit=0;
        while(c!=0) {
        	middledigit=c%10;
        	rev=rev*10+middledigit;
        	c=c/10;
        }System.out.println(rev);
        if(amsum==rev) {
        	System.out.println("palindrome");
        }else {
        	System.out.println("not a palindrome");
        }
	}

}
