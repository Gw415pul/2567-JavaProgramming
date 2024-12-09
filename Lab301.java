import java.util.*;
public class Lab301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		String text="";
		String word;
		while(true) {
			System.out.print("Enter word: ");
			word = kb.next();
			if(word.equalsIgnoreCase("stop")) {
				System.out.print("Your terminate program...");
				break;
			}
			text = text + word + " ";
		}
		System.out.println(text.toUpperCase());
		kb.close();
	}
	

}
