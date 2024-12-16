package labsheet03;
import javax.swing.*;
public class Lab302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 while (true) {
	            String email = JOptionPane.showInputDialog(null, "Input your e-mail:", "Input", JOptionPane.QUESTION_MESSAGE);

	            if (email == null || email.trim().isEmpty() || !email.contains("@")) {
	                JOptionPane.showMessageDialog(null, "Your e-mail is invalid. Please include '@' and avoid spaces.", "Error", JOptionPane.ERROR_MESSAGE);
	                continue;
	            }

	            if (email.toLowerCase().endsWith("@hotmail.com") || email.toLowerCase().endsWith("@gmail.com")) {

	                String confirmEmail = JOptionPane.showInputDialog(null, "Input your e-mail again:", "Input", JOptionPane.QUESTION_MESSAGE);

	                if (email.equalsIgnoreCase(confirmEmail)) {
	                    JOptionPane.showMessageDialog(null, "Your e-mail is " + email, "Message", JOptionPane.INFORMATION_MESSAGE);
	                    break; 
	                } else {
	                    JOptionPane.showMessageDialog(null, "The e-mails do not match. Please try again.", "Error", JOptionPane.INFORMATION_MESSAGE);
	                }
	            } else {
	                JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com", "Error", JOptionPane.INFORMATION_MESSAGE);
	            }
		 }

	}

}
