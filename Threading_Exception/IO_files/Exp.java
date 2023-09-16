package IO_files;

public class Exp {

	public static void main(String[] args) {
		
		int[] a = new int[5];
		try {
			for(int i=0;i<args.length;i++) {
				a[i]=Integer.parseInt(args[i]);
			}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		    finally {
		    	System.out.println("final block executed");
		    }
	}

}
