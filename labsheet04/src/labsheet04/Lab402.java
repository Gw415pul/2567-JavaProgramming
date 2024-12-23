package labsheet04;

import javax.swing.JOptionPane;

public class Lab402 {
    public static void main(String[] args) {
    	
        String input = JOptionPane.showInputDialog("Input year:");
        int year;

        try {
            year = Integer.parseInt(input);

            if (checkYear(year)) {
        
                if (isLeapYear(year)) {
                    JOptionPane.showMessageDialog(null, year + " is a Leap year.", "Message", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, year + " is NOT a Leap year.", "Message", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please enter a year between 1000 and 3000.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid year.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    public static boolean checkYear(int year) {
        return year >= 1000 && year <= 3000;
    }

    
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
