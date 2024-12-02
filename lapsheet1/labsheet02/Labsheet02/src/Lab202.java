import java.util.*;
public class Lab202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int pnum;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input number : ");
		pnum = scanner.nextInt();
		
		while(true) {
			System.out.println("Input number : ");
			num = scanner.nextInt();
			if(num<pnum) {
				System.out.println("\nBYE BYE");
				break;
			}else {
				pnum=num;
			}
		}
		
	}

}
