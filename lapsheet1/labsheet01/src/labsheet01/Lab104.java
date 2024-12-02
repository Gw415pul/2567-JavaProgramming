package com;
import javax.swing.*;
public class Lab104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		JOptionPane.showMessageDialog(null, "Welcome to the payroll application.","Massage", JOptionPane.INFORMATION_MESSAGE);
		
		String Name = JOptionPane.showInputDialog("Enter employee name.");
		
		String WHourStr = JOptionPane.showInputDialog(" Enter totel hours for this employee.");
		double WHour = Integer.parseInt(WHourStr);
		
		String WageHourStr = JOptionPane.showInputDialog(" Enter hourly wage for this employee.");
		double WageHour = Double.parseDouble(WageHourStr);
		
		double Gearning = (WHour*WageHour);
		double Tax = (Gearning*0.15);
		double Nearning = (Gearning - Tax);
		
		JOptionPane.showMessageDialog(null,
				"employee name"+ Name+"\nHours worked"+WHourStr+"\nHourly wage "+WageHour + "\nGross earnings: $"+ Gearning+"\nTax rate: 0.15"+ "\nTax: $"+Tax+"Net earning: $"+Nearning, 
				"Message",
				JOptionPane.INFORMATION_MESSAGE);
	}

}
