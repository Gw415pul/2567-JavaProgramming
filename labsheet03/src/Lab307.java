package labsheet03;
import java.util.Scanner;
public class Lab307 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Text :");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("It is not palindrome");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String text) {
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int left = 0, right = cleanedText.length() - 1;
        
        while (left < right) {
            if (cleanedText.charAt(left) != cleanedText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

	}

}
