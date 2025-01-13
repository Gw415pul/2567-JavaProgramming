package labsheet05;
import java.util.*;
public class Lab505 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {78, 36, 58, 41, 25, 92, 75};

        Scanner scanner = new Scanner(System.in);
        int index;

        while (true) {
            System.out.print("Input index of array: ");
            index = scanner.nextInt();

            if (index < 0 || index >= numbers.length) {
                System.out.print("Input index of array, again: ");
                index = scanner.nextInt();
            }


            if (index >= 0 && index < numbers.length) {
                System.out.println("Value in current index is " + numbers[index]);
                if (index == numbers.length - 1) {
                    System.out.println("Sorry, " + index + " is the last index in array.");
                } else {
                    System.out.println("Value in next index is " + numbers[index + 1]);
                }
                break;
            }
        }

        scanner.close();

	}

}
