package labsheet05;
import java.util.*;
public class Lab502 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];
        
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Input number " + (i + 1) + ": ");
            nums[i] = scanner.nextInt();
        }
        
        int sum = sumOfPos(nums);
        
        System.out.println("\nSummation of positive numbers is " + sum);
        
        scanner.close();

	}
	
	
	public static int sumOfPos(int[] nums) {
		int sum = 0;
		
		for(int num : nums) {
			if (num>0) {
				sum+=num;
			}
		}
		
		return sum;
	}

}
