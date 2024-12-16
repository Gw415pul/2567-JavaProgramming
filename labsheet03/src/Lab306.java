package labsheet03;
import java.util.Scanner;
public class Lab306 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Message: ");
        String message = scanner.nextLine();

        int index = message.toLowerCase().indexOf("nichi");

        if (index >= 0) {
            System.out.println("Nichi is a sentence");
        } else {
            System.out.println(message);
        }

        scanner.close();

	}

}
