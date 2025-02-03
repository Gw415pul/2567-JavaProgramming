package labsheet08;

public class Product {
	private String productId;
	private int productUnit;
	private double productPrice;
	
	public void setId(String pid) {
		pid=productId;
	}
	public String getId() {
		return productId;
	}
	public void setUnit(int proUnit) {
		proUnit=productUnit;
	}
	public int getUnit() {
		return productUnit;
	}
	public void setPrice(double proPrice) {
		proPrice=productPrice;
	}
	public double getPrice() {
		return productPrice;
	}
	public double calculate() {
		return getUnit()*getPrice();
	}

}
