package labsheet02;
import java.util.*;
public class Lab204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Input value of X: ");
        int x = scanner.nextInt();

        System.out.print("Input value of Y: ");
        int y = scanner.nextInt();

        if (y <= x) {
            System.out.println("The ending value (Y) must be greater than the starting value (X). Program terminated.");
            return;
        }

        int sum = 0;
        System.out.println();
        for (int i = x; i <= y; i++) {
            sum += i;
            System.out.printf("%d + %d = %d\n", sum - i, i, sum);
        }

        scanner.close();

	}

}
