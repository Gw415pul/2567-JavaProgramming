package labsheet08;

public class Product {
	
	private String productId;
    private int productUnit;
    private double productPrice;

    public Product(String productId, int productUnit, double productPrice) {
        this.productId = productId;
        this.productUnit = productUnit;
        this.productPrice = productPrice;
    }

    public void setId(String productId) {
        this.productId = productId;
    }

    public String getId() {
        return productId;
    }

    public void setUnit(int productUnit) {
        this.productUnit = productUnit;
    }

    public int getUnit() {
        return productUnit;
    }

    public void setPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getPrice() {
        return productPrice;
    }

    public double calculate() {
        return productUnit * productPrice;
    }

}
