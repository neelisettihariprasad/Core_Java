package hari.javaprogramming;

public class HDFC implements BAN{

	public float intrest;
    public float loan;
    
	public void Typeofloan(String businessLoan, double loanamt, int repay_months) {
		
		if(loan==house_loan) {
			intrest=(float) (loanamt*0.1f);
			System.out.println(" intrest is" + intrest);
		}else if(loan==edu_loan) {
			intrest=(float) (loanamt*0.085f);
			System.out.println(" intrest is "+ intrest);
		}else {
			intrest=(float) (loanamt*0.13f);
			System.out.println(" intrest is "+ intrest);
		}
	}
	public static void main(String[] args) {
		HDFC h=new HDFC();
		h.Typeofloan("house_loan", 30000, 5);
		h.Typeofloan("edu_loan", 40000, 5);
		h.Typeofloan("business_loan", 50000, 5);
	}
	
}
