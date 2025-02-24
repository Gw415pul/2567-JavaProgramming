import java.util.*;
import java.io.*;
public class Lab1103 {
	static Scanner scan = new Scanner(System.in);
 
	public static void main(String[] args) throws IOException{
		System.out.print("Enter rating of book: ");
		double Rating = scan.nextDouble();
		
		bookRating(Rating);
		bookList(Rating);

	}
	public static void bookRating(double rate) {
		System.out.println("------------------------------------------------");
	}
	public static void bookList(double rate) throws IOException {
		try(BufferedReader BookFile = new BufferedReader(new FileReader("src//txtFile//BookData.txt"))){
			String temp="";
			int i=0;
			while((temp=BookFile.readLine())!=null) {
				String[] data = temp .split("\t");
				i++;
				if(data.length<7) continue;
				double book = Double.parseDouble(data[3]);
				if(book==rate) {
					System.out.printf("Book %f :%s by %s \t(%f) reviews%n ",i,data[0],data[1],data[3]);
				}
			}
		}
	}

}
