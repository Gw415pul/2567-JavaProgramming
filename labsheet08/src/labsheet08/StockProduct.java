package labsheet08;
import java.util.*;
public class StockProduct {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Product[] products = new Product[4];

        
        for (int i = 0; i < 4; i++) {
            System.out.print("Input product Id: ");
            String id = scan.nextLine();

            System.out.print("Input product Unit: ");
            int unit = scan.nextInt();

            System.out.print("Input product Price: ");
            double price = scan.nextDouble();
            scan.nextLine(); 

           
            products[i] = new Product(id, unit, price);
            System.out.println();
        }

        printLine();

        
        System.out.println("\nProduct Details:");
        for (Product p : products) {
            System.out.println(">> " + p.getId() + " has " + p.getUnit() + " units, Price: " + p.getPrice() + ", Total Value: " + p.calculate());
        }

        scan.close();
    }

    public static void printLine() {
        for (int i = 1; i < 60; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}