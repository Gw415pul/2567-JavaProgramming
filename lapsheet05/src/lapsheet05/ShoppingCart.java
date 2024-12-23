package lapsheet05;

public class ShoppingCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayItemsAndtotal("Apple",10.5,"Banana",5.75,"Orange",7.3);
		displayItemsAndtotal("Milk",20.0,"Bread",15.0);
		displayItemsAndtotal();

	}
	
    public static void displayItemsAndtotal(Object... items) {
		if(items.length == 0) {
			System.out.println("No items in the cart.");
			return;
		}
		double totalPrice = 0.0;
		System.out.println("items in the cart:");
		for(int i =0 ; i< items.length;i+=2) {
			String itemsName = (String)items[i];
			double itemPrice = (double)items[i+1];
			totalPrice += itemPrice;
			
			System.out.printf("- %s: $%.2f%n", itemsName,itemPrice);
		}
		
		System.out.printf("Total Price: $%.2f%n",totalPrice);
		System.out.println();
	}

}
