package com;
import java.util.*;
import java.text.*;
public class Lab101 {

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
        float totelPriceProduct = productUnit* productPrice;
        System.out.println("Totel Price is"+ frm.format(totelPriceProduct)+"baht.");

        System.out.println("How many discount (%) ");
        float Dis = scan.nextFloat();
        
        float totelDis =(totelPriceProduct * (Dis/100));
        float totelpaid = (totelPriceProduct - totelDis);
        System.out.println("\nDiscount from "+Dis+"%  : "+frm.format(totelDis)+" baht.");
        System.out.println("Amount to be paid "+frm.format(totelpaid)+" baht.");

        scan.close();

	}

}
