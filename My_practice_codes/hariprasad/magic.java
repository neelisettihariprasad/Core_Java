package hariprasad;

public class magic {

	public static void main(String[] args) {
		int num=10021;
		while(num>9) {
			int sum=0;
			int lastdigit=0;
			while(num!=0) {
			lastdigit=num%10;
			sum=sum+lastdigit;
			num=num/10;
		}
		if(sum==1) {
			System.out.println("magic");
		}else {
			System.out.println("not magic");
		}

	}

}
}

