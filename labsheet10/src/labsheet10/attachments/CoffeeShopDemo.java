package labsheet10;
import java.util.*;
public class CoffeeShopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Drink Type: (1) Hot (2) Cold");
        int drinkType = scanner.nextInt();

        System.out.println("Coffee Type: (1) Americano (2) Espresso (3) Cappuccino");
        int coffeeType = scanner.nextInt();

        System.out.println("Coffee Size: (S) Short (T) Tall (G) Grande (V) Venti");
        char coffeeSize = scanner.next().charAt(0);

        Barista[] baristas = {
            new Barista("Alice", 'F'),
            new Barista("Bob", 'M'),
            new Barista("Charlie", 'M')
        };

        System.out.println("Select Barista Number:");
        for (int i = 0; i < baristas.length; i++) {
            System.out.println((i + 1) + ". " + baristas[i].getName() + " (" + baristas[i].getGenderName() + ")");
        }

        int baristaChoice = scanner.nextInt();
        if (baristaChoice < 1 || baristaChoice > baristas.length) {
            System.out.println("Barista Number. Defaulting to Alice.");
            baristaChoice = 1;
        }

        Barista selectedBarista = baristas[baristaChoice - 1];

        Coffee coffee = new Coffee(drinkType, 'M', coffeeType, coffeeSize, selectedBarista);

        System.out.println("\nOrder Details:");
        System.out.println(coffee.toString());

        scanner.close();
		
	}

}
