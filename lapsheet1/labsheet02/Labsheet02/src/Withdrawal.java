import javax.swing.*;
import java.util.*;
import java.text.*;
public class Withdrawal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int balance = rand.nextInt(9)*100000;
		DecimalFormat frm = new DecimalFormat("#,###");
		
		int moneywithdraw = Integer.parseInt(JOptionPane.showInputDialog("Your balance :"+frm.format(balance)+"\nInput money to with draw:"));
		
		if(moneywithdraw>balance) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than balance","ERROR", JOptionPane.ERROR_MESSAGE);
		}else if (moneywithdraw>50000) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than 50,000","ERROR", JOptionPane.ERROR_MESSAGE);
		}else if (moneywithdraw%100 != 0) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw "+frm.format((moneywithdraw % 100))+" baht.","ERROR", JOptionPane.ERROR_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, "You withdraw is "+ moneywithdraw + " baht."+
		"\n1,000 = "+(moneywithdraw/1000)+
		"\n500 = "+ ((moneywithdraw%1000)/500)+
		"\n100 = "+ (((moneywithdraw%1000)%500)/100));
		}
	}

}
