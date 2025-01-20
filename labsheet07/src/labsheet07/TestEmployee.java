package labsheet07;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee(8, "Peter", "Tan", 2500);
		 System.out.println(e1); // toString();
		 e1.setsalary(999); // Test Setters and Getters
		 System.out.println(e1); // toString();
		 System.out.println("id is: " + e1.getId());
		 System.out.println("firstname is: " + e1.getfirstName());
		 System.out.println("lastname is: " + e1.getlastName());
		 System.out.println("salary is: " + e1.getsalary());
		 System.out.println("name is: " + e1.getName());
		 System.out.println("annual salary is: " + 
		e1.getAnnualSalary()); // Test method
		 // Test raiseSalary()
		 System.out.println("RaiseSalary = "+e1.raiseSalary(10));
		 System.out.println(e1);

	}

}
