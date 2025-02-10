package labsheet09;

public class testCustomer {

	public static void main(String[] args) {
		System.out.println("###Test Customer class###");
		 Customer c1 = new Customer(1088, "Conan Edogawa", 10);
		 System.out.println(c1);
		 c1.setDiscount(5);
		 System.out.println(c1);
		 
		 Line();
		 System.out.println();
		 System.out.println("id is: "+c1.getCustID());
		 System.out.println("nmae is: "+c1.getCustName());
		 System.out.println("discount is: "+c1.getDiscount());
		 Line();
		 System.out.println();
		 System.out.println("###Test Invoice class###");
		 Invoice inv1 = new Invoice(101, c1, 12000.00);
		 System.out.println(inv1);
		 inv1.setAmount(10000);
		 System.out.println(inv1);
		 
		 Line();
		 System.out.println();
		 System.out.println("id is: "+inv1.getInvId());
		 System.out.println("customer is: "+inv1.getCustomer());
		 System.out.println("amount is: "+inv1.getAmount());
		 Line();
		 System.out.println();
		 System.out.println("Customer's id is: "+inv1.getCustomerID());
		 System.out.println("Customer's name is: "+inv1.getCustomerName());
		 System.out.println("Customer's discount is: "+inv1.getCustomerDiscount());
		 System.out.println("Customer's amount after discount is: "+inv1.getAmountAfterDiscount());
		 
	}
	
	public static void Line() {
		for(int i=1;i<60;i++) {
			System.out.print("=");
			
		}
	}

}
