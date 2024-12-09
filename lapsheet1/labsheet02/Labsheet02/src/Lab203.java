package labsheet02;
import javax.swing.*;
public class Lab203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String weightInput = JOptionPane.showInputDialog(null, "Input Weight (kg):", "Input", JOptionPane.QUESTION_MESSAGE);
        if (weightInput == null) return; 

      
        String heightInput = JOptionPane.showInputDialog(null, "Input Height (cm):", "Input", JOptionPane.QUESTION_MESSAGE);
        if (heightInput == null) return; 

        try {
          
            double weight = Double.parseDouble(weightInput);
            double heightCm = Double.parseDouble(heightInput);
            double heightM = heightCm / 100.0; 
            
            double bmi = weight / (heightM * heightM);

           
            String category;
            if (bmi < 18.5) {
                category = "Underweight";
            } else if (bmi < 25.0) {
                category = "Normal weight";
            } else if (bmi < 30.0) {
                category = "Overweight";
            } else {
                category = "Obesity";
            }

           
            String result = String.format("BMI = %.1f\nYou're %s", bmi, category);

            JOptionPane.showMessageDialog(null, result, "BMI", JOptionPane.WARNING_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input! Please enter numeric values.", "Error", JOptionPane.ERROR_MESSAGE);
        }

	}

}
