package labsheet10;
import java.util.*;
public class FictionBookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Book Title : ");
		String bookTitle = scan.nextLine();
		System.out.print("Book Publish year: ");
		int publicYar = scan.nextInt();
		
		System.out.print("Author name: ");
		String authorName= scan.nextLine();
		scan.nextLine();
		System.out.print("Author email: ");
		String authorEmail = scan.nextLine();
		
		FictionBook book1 = new FictionBook(bookTitle, publicYar);
		book1.setAuthorName(authorName);
		book1.setEmail(authorEmail);
		while(!book1.checkEmail()) {
			System.out.print("Author email, again: ");
			authorEmail = scan.nextLine();
			book1.setEmail(authorEmail);
		}
		System.out.println(book1);
		scan.close();
		Line();

	}


public static void Line() {
	for(int i=1;i<60;i++) {
		System.out.print("=");
		System.out.println();
	}

}}