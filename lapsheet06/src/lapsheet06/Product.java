package lapsheet06;

public class Product {
	private String name;
	private double price;
	private double vatRate;
	
	public void setProductDetails(String Proname, double Proprice, double ProvatRate) {
		name = Proname;
		price = Proprice;
		vatRate = ProvatRate;
	}
	
	public double calculateTotalPrice() {
		
		
		return ((vatRate/100) * price)+price;
	}
	
	public void displayProductDetails() {
		System.out.println("Product Details:");
		System.out.println("Product Name: "+name);
		System.out.println("Price (Before Vat): "+price);
		System.out.println("Price (After): "+ calculateTotalPrice());
		
	}

}
