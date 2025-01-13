package labsheet05;
import javax.swing.*;
public class Lab508 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {25, 78, 41, 22, 36, 65, 37};
        int index;

        while (true) {
            String input = JOptionPane.showInputDialog(null, "Input index of array:", "Input", JOptionPane.QUESTION_MESSAGE);

            if (input == null) { 
                break;
            }

            try {
                index = Integer.parseInt(input);

                if (checkIndex(nums, index)) {
                    int current = currentData(nums, index);
                    String prev = (prevData(nums, index) != null) ? "nums[" + (index - 1) + "] is " + prevData(nums, index) : "No previous data";
                    String next = (nextData(nums, index) != null) ? "nums[" + (index + 1) + "] is " + nextData(nums, index) : "No next data";

                    String message = String.format(
                            "Current data, nums[%d] is %d\nPrevious data, %s\nNext data, %s",
                            index, current, prev, next
                    );

                    JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid index. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static boolean checkIndex(int[] nums, int index) {
        return index >= 0 && index < nums.length;
    }

    public static int currentData(int[] nums, int index) {
        return nums[index];
    }

    public static Integer prevData(int[] nums, int index) {
        if (index > 0) {
            return nums[index - 1];
        }
        return null;
    }

    public static Integer nextData(int[] nums, int index) {
        if (index < nums.length - 1) {
            return nums[index + 1];
        }
        return null;

	}

}
