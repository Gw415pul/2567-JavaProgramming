package labsheet09;

public class Invoice {
	private int invid;
	private Customer customer;
	private double amount;
	
	public Invoice(int invid, Customer customer, double amount) {
		this.amount=amount;
		this.customer= customer;
		this.invid=invid;
	}
	
	public int getInvId() {
		return this.invid;
	}
	
	public double getAmount() {
		return this.amount;
	}
	
	public void setAmount(double amount) {
		this.amount=amount;
	}
	
	public void setCustomer(Customer customer) {
		this.customer=customer;
	}
	
	public Customer getCustomer() {
		return this.customer;
	}
	
	public int getCustomerID() {
		return getCustomer().getCustID();
	}
	
	public String getCustomerName() {
		return getCustomer().getCustName();	
	}
	
	public int getCustomerDiscount() {
		return getCustomer().getDiscount();
	}
	
	public double getAmountAfterDiscount() {
		return getAmount()-(getAmount()*(getCustomerDiscount()/100));
	}
	
	public String toString() {
		return "Invoice[ id= "+getInvId()+"customer= "+customer.toString()+
				" ,amount= "+getAmountAfterDiscount()+" ]"
;	}
	
}
