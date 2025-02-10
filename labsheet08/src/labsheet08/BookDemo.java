package labsheet08;
import java.util.*;
public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Input author name: ");
        String authorName = scanner.nextLine();

        System.out.print("Input author e-mail: ");
        String authorEmail = scanner.nextLine();

        Author author = new Author(authorName, authorEmail);

        System.out.print("\nInput book title: ");
        String bookTitle = scanner.nextLine();

        System.out.print("Input book page: ");
        int bookPage = scanner.nextInt();

        Book book = new Book(bookTitle, author, bookPage);

        System.out.println("\n" + book.toString());

        scanner.close();

	}

}
