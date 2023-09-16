package hariprasadn;

public class fibanacci {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int i=1;
     
        int sum=0;
		/*for(int i=1;i<=7;i++)
		{
			a=b;
			b=sum;
			sum=a+b;
			
		}System.out.println(sum);*/
        while(i<=6) {
        	a=b;
        	b=sum;
        	sum=a+b;
        	i++;
        }System.out.println(sum);
	}

}
