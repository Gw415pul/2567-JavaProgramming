package labsheet03;
import java.util.Scanner;
public class Lab303 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Input a sentence: ");
            String sentence = scanner.nextLine();

            if (!sentence.trim().endsWith(".")) {

                System.out.print("Input the sentence again: ");
                continue;
            }

            System.out.print("Input the sentence again: ");
            String confirmSentence = scanner.nextLine();

            if (!sentence.equals(confirmSentence)) {
                System.out.println("The sentences do not match. Please try again.");
                continue;
            }

            int spaceCount = 0;
            int wordCount = 0;

            String trimmedSentence = sentence.trim().substring(0, sentence.length() - 1);

            for (char c : trimmedSentence.toCharArray()) {
                if (c == ' ') {
                    spaceCount++;
                }
            }

            if (!trimmedSentence.isEmpty()) {
                wordCount = spaceCount + 1;
            }

            System.out.println("This sentence has " + spaceCount + " spacebar(s).");
            System.out.println("This sentence has " + wordCount + " word(s).");
            break; 
        }

        scanner.close();

	}

}
