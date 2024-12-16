package labsheet03;
import javax.swing.*;
public class Lab303_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {

            String sentence = JOptionPane.showInputDialog(null, "Input a sentence:", "Input", JOptionPane.QUESTION_MESSAGE);

            if (sentence == null || !sentence.trim().endsWith(".")) {
                
                continue;
            }

            String confirmSentence = JOptionPane.showInputDialog(null, "Input the sentence again:", "Input", JOptionPane.QUESTION_MESSAGE);

            if (!sentence.equals(confirmSentence)) {
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

            JOptionPane.showMessageDialog(null, "This sentence has " + spaceCount + " spacebar(s).\n" +
                    "This sentence has " + wordCount + " word(s).", "Result", JOptionPane.INFORMATION_MESSAGE);
            break;
        }

	}

}
