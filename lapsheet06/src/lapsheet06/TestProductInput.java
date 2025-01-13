package lapsheet06;
import java.util.*;
public class TestProductInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Product pro1 = new Product();
		
		System.out.print("Enter product name: ");
		String pro1Name = scan.nextLine();
		
		System.out.print("Enter product price: ");
		double pro1Price  = scan.nextDouble();
		scan.nextLine();
		
		System.out.print("Enter VAT rate(%): ");
		double pro1vatRate = scan.nextDouble();
		scan.nextLine();

		pro1.setProductDetails(pro1Name, pro1Price, pro1vatRate);
		pro1.displayProductDetails();
	}

}
