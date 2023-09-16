package hariprasadn;

public class count {

	public static void main(String[] args) {
		int num=12345;
		int evencount=0;
		int oddcount=0;
	    int lastdigit=0;
	    while(num!=0) {
	    	lastdigit=num%10;
	    	if(lastdigit%2==0) {
	    		evencount++;
	    	}else {
	    		oddcount++;
	    	}num=num/10;
	    }System.out.println(evencount);
	     System.out.println(oddcount);

	}

}
