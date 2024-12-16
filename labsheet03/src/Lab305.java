package labsheet03;
import java.util.Scanner;
public class Lab305 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        String sentence;

        while (true) {
            System.out.print("Input some sentence: ");
            sentence = scanner.nextLine();

            if (sentence.length() > 0 && sentence.charAt(sentence.length() - 1) == '.') {
                break;
            } else {
                System.out.println("The sentence must end with a full stop. Try again!");
            }
        }

        System.out.println("\nThe sentence with full stop: " + sentence);

        System.out.println("\nThe sentence in word-by-word format:");
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        scanner.close();

	}

}
