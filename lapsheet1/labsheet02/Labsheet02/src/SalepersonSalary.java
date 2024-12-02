import java.util.Scanner;
public class SalepersonSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double COMMISSION_RATE =0.155;
		final int SENTINEL =-1;
		final double BASE_SALARY =1000.0;
		
		int sales ;
		double salary ;
		
		Scanner inuput = new Scanner(System.in);
		while(true) {
			System.out.println("Enter qross sales for the salesperson (or -1 to end):");
			sales = inuput.nextInt();
			
			if(sales == SENTINEL) {
				break;
			}
			
			salary = BASE_SALARY + (sales * COMMISSION_RATE);
			System.out.printf("The salesperson's salary is $%,.2f",salary);
			System.out.println();
		}
		System.out.println("bye.");
		System.out.println("All salesperson's salaries have been computed.");

	}

}
