package labsheet01;
import java.util.*;
import java.text.*;
public class javaexample1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		DecimalFormat frm = new DecimalFormat("#,####.00");
		
		System.out.println("Input product name");
        String productName = scan.nextLine();
        
        System.out.println("Input product unit");
        int productUnit = scan.nextInt();
        
        System.out.println("Input price per unit");
        float productPrice = scan.nextFloat();
        
        System.out.println();
        System.out.println("Product name is "+ productName);
        
        System.out.println();
        float totelPriceProduct = productUnit* productPrice;
        System.out.println("Totel Price is"+ frm.format(totelPriceProduct)+"baht.");
        
        float totelVat = totelPriceProduct + (totelPriceProduct * 7/100);
        System.out.println("Add VAT 7% is "+frm.format(totelVat)+"baht.");
        
        
        System.out.printf("Product name is : %s", productName);
        System.out.printf("Totel price is %.2f", totelPriceProduct);
        System.out.printf("Add VAt 7%% is ", String.format("%,.2f", totelVat));
        
        
        scan.close();
	}
	
}
