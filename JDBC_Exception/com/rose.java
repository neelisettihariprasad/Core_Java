package Test.com;

public class rose {
	

		

	public void get(int k, int l, int m) {

		assert ( k > l && k > m) : " its ok";

		System.out.println(" Its assertion");

		}

		public static void main(String[] args) {

		rose r = new rose();

		r.get(10, 20, 5);

		}

		}


