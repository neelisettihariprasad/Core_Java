package hariprasad;

public class Exp {

	public static void main(String[] args) {
		/*int base=2;
		int power=2;
		int exponential=1;
		for(int a=1;a<=power;a++) {
			exponential=exponential*base;
		}System.out.println(exponential);*/
		/*int num=12435;
		int sum=0;
		int lastdigit=0;
		while(num!=0) {
			lastdigit=num%10;
			if(lastdigit%2==1) {
			  sum=sum+lastdigit;
			}num=num/10;
		}System.out.println(sum);*/
		int num=145;
		int temp=num;
		int sum=0;
		int lastdigit=0;
		while(num!=0) {
			lastdigit=num%10;
			int factorial=1;
			for(int a=1;a<=lastdigit;a++) {
				factorial=factorial*a;
			}sum=sum+factorial;
			num=num/10;
		}System.out.println(sum);
	    if (temp==sum) {
	    	System.out.println("strong num");
	    }else {
	    	System.out.println("not strong num");
	    }

		}

	}


