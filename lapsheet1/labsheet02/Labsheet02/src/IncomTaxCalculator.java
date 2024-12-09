package labsheet02;
import java.util.*;
public class IncomTaxCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double TAX_RATE_ABOVE_20K = 0.1;
        final double TAX_RATE_ABOVE_40K = 0.2;
        final double TAX_RATE_ABOVE_60K = 0.3;

        double taxPayable = 0.0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the taxable income: $");
        int income = scanner.nextInt();
        
        if (income <= 20000) {
            taxPayable = 0; 
        } else if (income <= 40000) {
            taxPayable = (income - 20000) * TAX_RATE_ABOVE_20K;
        } else if (income <= 60000) {
            taxPayable = (20000 * TAX_RATE_ABOVE_20K) +
                         (income - 40000) * TAX_RATE_ABOVE_40K;
        } else {
            taxPayable = (20000 * TAX_RATE_ABOVE_20K) +
                         (20000 * TAX_RATE_ABOVE_40K) +
                         (income - 60000) * TAX_RATE_ABOVE_60K;
        }
        
        System.out.printf("The income tax payable is: $%.2f%n", taxPayable);
        
        scanner.close();

	}

}
