package hariprasad;

public class Prime {

	public static void main(String[] args) {
		/*for(int a=1;a<=100;a++) {
			int count=0;
			for (int b=1;b<=a;b++) {
				if(a%b==0) {
					count++;
			}
		}if(count==2) {
			System.out.println(a);
		}

	}*/
		int num=8;
		int sum=0;
		for(int a=1;a<num;a++) {
			if(num%a==0) {
				sum=sum+a;
			}
		}if (sum==num) {
			System.out.println("perfect number");
		}else {
			System.out.println("not perfect number");
		}

}
}
