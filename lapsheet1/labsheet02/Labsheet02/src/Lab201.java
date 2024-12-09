package labsheet02;
import javax.swing.*;
import java.text.*;
public class lab201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			final int BUFFET =299;
			double discount;
			int isMember;
			DecimalFormat frm = new DecimalFormat("#,###.00");
			int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customber per bill?"));
			double totelPrice = numberofCustomer*BUFFET;
			
			do {
				 isMember = JOptionPane.showConfirmDialog(null, "Totel Price is "+ frm.format(totelPrice) + " baht."+"\nDo you have a member card?");
			} while (isMember == 2);
			
			if(isMember == 0) {
				discount = totelPrice * 0.90;
				JOptionPane.showInternalMessageDialog(null, "Amont to be paid is"+ frm.format(discount) + " baht.");
			}else if(isMember == 1){
				JOptionPane.showMessageDialog(null, "Amont to be paid is"+ frm.format(totelPrice)+" baht.");
			}else {
				
			}

	}

}
