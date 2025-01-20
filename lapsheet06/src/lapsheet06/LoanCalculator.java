package labsheet06;

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
		double r = interestRate / 100 / 12; // Monthly interest rate
        int n = years * 12; // Total number of payments
        double monthlyPayment = price * r * Math.pow(1 + r, n) / (Math.pow(1 + r, n) - 1);
        return monthlyPayment;
	}
	
	 public void displayLoanDetails() {
	        System.out.println("Product: " + productName);
	        System.out.println("Price: " + price);
	        System.out.println("Interest Rate: " + interestRate + "%");
	        System.out.println("Loan Period: " + years + " years");
	        System.out.println("Monthly Payment: " + String.format("%.2f", calculateMonthlyPayment()));
	    }
}


