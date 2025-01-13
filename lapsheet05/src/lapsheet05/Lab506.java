package labsheet05;
import javax.swing.*;
public class Lab506 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] greetings = {"Good Morning", "Good Afternoon", "Good Evening", "Good Night"};
	        StringBuilder message = new StringBuilder("The greeting words in English:\n");
	        
	        for (String greeting : greetings) {
	            message.append("- ").append(greeting).append("\n");
	        }

	        JOptionPane.showMessageDialog(null, message.toString(), "Message", JOptionPane.INFORMATION_MESSAGE);

	}

}
