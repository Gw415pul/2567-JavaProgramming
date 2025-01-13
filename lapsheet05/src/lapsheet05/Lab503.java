package labsheet05;
import java.util.*;
public class Lab503 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] nums = new int[7];
		
		for (int i = 0; i < nums.length; i++) {
            System.out.print("Input number " + (i + 1) + ": ");
            nums[i] = scanner.nextInt();
        }
		int oddCount = 0 ;
		String oddNumber ="";
		
		for(int num : nums) {
			if (num%2 != 0) {
				oddCount++;
				oddNumber += num + " ";
			}
		}
		
		System.out.println("There are " + oddCount + " odd numbers.");
        System.out.println("List of odd numbers: " + oddNumber.trim());

        scanner.close();
    
	}

}
