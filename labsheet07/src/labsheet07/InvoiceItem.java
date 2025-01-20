package labsheet07;

public class InvoiceItem {
	private String id;
	private String desc;
	private int qty;
	private double uniPrice;
	
	InvoiceItem(String id,String desc,int qty, double uniPrice) {
		this.id=id;
		this.desc= desc;
		this.qty=qty;
		this.uniPrice=uniPrice;
	}
	
	public String getId() {
		return this.id;
	}
	public String getdesc() {
		return this.desc;
	}
	public int getQty() {
		return this.qty;
	}
	public void setQty(int qty) {
		this.qty=qty;
	}
	public double getUnitPrice(){
		return this.uniPrice;
	}
	public void setUnitPrice(double uniPrice) {
		this.uniPrice=uniPrice;
	}
	public double getTotal() {
		return this.uniPrice*this.qty;
	}
	public String toString() {
		return "InvoiceItem[id= "+this.id+",desc= "+this.desc+",unitPrice= "+this.uniPrice;
	}

}
