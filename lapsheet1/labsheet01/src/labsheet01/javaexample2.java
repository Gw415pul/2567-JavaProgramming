package labsheet01;
import javax.swing.*;
public class javaexample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String productName = JOptionPane.showInputDialog("Input Product Name :");
		
		String productUnitStr = JOptionPane.showInputDialog("Input product Unit :");
		int productUnit = Integer.parseInt(productUnitStr);
		
		double productPrice = Double.parseDouble(JOptionPane.showInputDialog("Input Price per unit :"));
		
		double totelPrice = productPrice * productUnit;
		double totelVat = totelPrice +(totelPrice * 7/100);
		String frmtotelPrice = String.format("%,.2f", totelPrice);
		String frmTotelVat = String.format("%.2f", totelVat);
		
		JOptionPane.showMessageDialog(null, "Totel Price is "+ frmtotelPrice + "baht." + "\nAdd VAT 7% is "+ frmTotelVat+ "baht.");
		

	}

}
