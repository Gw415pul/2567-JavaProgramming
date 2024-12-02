package com;
import javax.swing.*;
public class MusicWorldApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, 
	            "This program calculates the total cost of a CD order");

	        // รับข้อมูลจากผู้ใช้ผ่าน Dialog Box
	        String cdId = JOptionPane.showInputDialog("Please enter the ID of the CD:");
	        String cdTitle = JOptionPane.showInputDialog("Please enter the title of the CD:");
	        String cdPriceInput = JOptionPane.showInputDialog("Please enter the price of the CD in U.S. dollars:");
	        String cdQuantityInput = JOptionPane.showInputDialog("Please enter the quantity to be purchased:");

	        double cdPrice = Double.parseDouble(cdPriceInput);
	        int cdQuantity = Integer.parseInt(cdQuantityInput);

	        double subtotal = cdPrice * cdQuantity;

	        double taxRate = 0.0625;
	        double tax = subtotal * taxRate;
	        double total = subtotal + tax;

	        String output = String.format(
	            "Summary of the transaction:\n" +
	            "CD ID: %s\n" +
	            "CD Title: %s\n" +
	            "CD Unit Price: $%.2f\n" +
	            "CD Quantity: %d\n" +
	            "\nSubtotal: $%.2f\n" +
	            "Tax rate: %.2f%%\n" +
	            "Total: $%.2f\n" +
	            "\nEnd of Program",
	            cdId, cdTitle, cdPrice, cdQuantity, subtotal, taxRate * 100, total
	        );

	        JOptionPane.showMessageDialog(null, output);

	}

}
