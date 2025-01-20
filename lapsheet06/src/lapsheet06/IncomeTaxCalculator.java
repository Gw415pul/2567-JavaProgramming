package labsheet06;

public class IncomeTaxCalculator {
	private double Income;
	public void setIncome(double income) {
		Income = income;
	}
	
	public double calculateTax() {
        double tax = 0;

        if (Income <= 150000) {
            tax = 0; 
        } else if (Income <= 300000) {
            tax = (Income - 150000) * 0.05; 
        } else if (Income <= 500000) {
            tax = (150000 * 0.05) + (Income - 300000) * 0.10; 
        } else {
            tax = (150000 * 0.05) + (200000 * 0.10) + (Income - 500000) * 0.15;
        }
        return tax;
    }
	
	public void displayTaxDetails() {
        System.out.println("Income: " + Income);
        System.out.println("Tax: " + String.format("%.2f", calculateTax()));
    }

}
