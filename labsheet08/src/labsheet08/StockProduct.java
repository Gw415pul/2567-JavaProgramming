package labsheet08;
import java.util.*;
public class StockProduct {

	public static void main(String[] args) {
		Scanner  scan = new Scanner(System.in);
		
		Product[] pro = new Product[4];
		
		for(int i=0; i<4; i++) {
			System.out.print("Input product Id : ");
			String id = scan.nextLine();
			System.out.print("Input product Unit : ");
			int Unit = scan.nextInt();
			scan.nextLine();
			System.out.print("Input product Price : ");
			double Price = scan.nextDouble();
			scan.nextLine();
			System.out.println();
		}
		Line();
		}
		
		public static void Line() {
			for(int i=1;i<60;i++) {
				System.out.print("-");
			}

	
		}
}
