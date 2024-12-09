package labsheet02;
import javax.swing.*;
public class Icecream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int VANILLA = 10;
        final int CHOCOLATE = 15;
        final int TOPPING = 5;

        int flavorPrice = 0;
        String flavor = "";

        boolean validChoice = false;
        while (!validChoice) {
            String choice = JOptionPane.showInputDialog(null,
                    "[1] Vanilla Flavor 10 B.\n[2] Chocolate Flavor 15 B.\n\nPress number to choose flavor:",
                    "Input", JOptionPane.QUESTION_MESSAGE);

            if (choice == null) return; 

            switch (choice) {
                case "1":
                    flavorPrice = VANILLA;
                    flavor = "Vanilla";
                    validChoice = true;
                    break;
                case "2":
                    flavorPrice = CHOCOLATE;
                    flavor = "Chocolate";
                    validChoice = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ERROR: Wrong choice! Try again.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }

        int addTopping = JOptionPane.showConfirmDialog(null, "Do you want to add topping?", "Topping",
                JOptionPane.YES_NO_OPTION);

        if (addTopping == JOptionPane.CLOSED_OPTION) return; 

        int totalPrice = flavorPrice + (addTopping == JOptionPane.YES_OPTION ? TOPPING : 0);

        String toppingMessage = addTopping == JOptionPane.YES_OPTION ? "and topping." : "and no topping.";
        JOptionPane.showMessageDialog(null, String.format("You chose %s flavor %s\nTotal price is %d Baht.",
                flavor, toppingMessage, totalPrice), "Message", JOptionPane.INFORMATION_MESSAGE);

	}

}
