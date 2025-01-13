package labsheet05;
import javax.swing.*;
public class Lab507 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[5];

        // Input 5 numbers from the user
        for (int i = 0; i < numbers.length; i++) {
            String input = JOptionPane.showInputDialog(null, "Input number " + (i + 1) + ":", 
                                                       "Input", JOptionPane.QUESTION_MESSAGE);
            numbers[i] = Integer.parseInt(input);
        }

        // Call the methods to show even and odd numbers
        showEven(numbers);
        showOdd(numbers);
    }

    public static void showEven(int[] nums) {
        StringBuilder evenNumbers = new StringBuilder("List of even numbers:\n");
        for (int num : nums) {
            if (num % 2 == 0) {
                evenNumbers.append(num).append(" ");
            }
        }
        JOptionPane.showMessageDialog(null, evenNumbers.toString(), "Even Numbers", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void showOdd(int[] nums) {
        StringBuilder oddNumbers = new StringBuilder("List of odd numbers:\n");
        for (int num : nums) {
            if (num % 2 != 0) {
                oddNumbers.append(num).append(" ");
            }
        }
        JOptionPane.showMessageDialog(null, oddNumbers.toString(), "Odd Numbers", JOptionPane.INFORMATION_MESSAGE);

	}

}
