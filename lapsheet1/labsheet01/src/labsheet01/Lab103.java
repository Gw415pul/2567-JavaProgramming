package com;
import javax.swing.*;
public class Lab103 {

	public static void main(String[] args) {
String input = JOptionPane.showInputDialog("Input Time Parking (minute):");
        
        try {
            int totalMinutes = Integer.parseInt(input);
         
            int hours = totalMinutes / 60;
            int minutes = totalMinutes % 60;
            
            double hourlyRate = 50.0; 
            double minuteRate = 0.25; 
            double totalFee = (hours * hourlyRate) + (minutes * minuteRate);
            
      
            String message = String.format(
                "You parking %d Hour %d Minute.\nAmount to be paid is %.2f bath.",
                hours, minutes, totalFee
            );
            
            JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Input", "Error", JOptionPane.ERROR_MESSAGE);
        }
		
		
		
		


	}

}
