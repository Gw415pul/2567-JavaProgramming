package lapsheet06;

public class LoanCalculator {
	private String productName;
	private double price ;
	private double interestRate;
	private int years;
	
	public void setLoanDetails(String proName, double proPrice, double proInterestRate, int proYears) {
		productName = proName;
		price = proPrice;
		interestRate = proInterestRate;
		years = proYears;
	}
	
	public double calculateMonthlyPayment() {
		double r=interestRate/12;
		int n =years *12;
		
	    return (price*r*);
	}

}
