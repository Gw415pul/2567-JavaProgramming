package labsheet03;
import java.util.Scanner;
public class Lab304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Full name: ");
        String fullName = scanner.nextLine();

        if (!fullName.contains(" ")) {
            System.out.println("Incorrect Name");
        } else {
            String[] nameParts = fullName.split(" ", 2);
            String firstName = nameParts[0];
            String lastName = nameParts[1];

            System.out.println("First Name: " + firstName.toUpperCase());
            System.out.println("Last Name: " + lastName.toLowerCase());
        }

        scanner.close();

	}

}
