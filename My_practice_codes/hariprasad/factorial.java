package hariprasad;


public class factorial{

	public static void main(String[] args)
	{
		int n=2;
		int primecount=1;
		while(primecount<=100) {
			int count=0;
			for(int a=1;a<=n;a++) {
				if(n%a==0) {
					count++;
				}
			}if(count==2) {
				System.out.println(n);
				primecount++;
			}n++;
		}
	}

}
