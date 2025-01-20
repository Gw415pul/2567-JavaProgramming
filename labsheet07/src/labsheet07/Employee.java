package labsheet07;

public class Employee {
      private int id;
      private String firstName;
      private String lastName;
      private int salary;
      
      Employee(int id,String firstName,String lastName,int salary) {
		this.id=id;
		this.firstName=firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
      public int getId() {
    	  return this.id;
      }
      public String getfirstName() {
    	  return this.firstName;
      }
      public String getlastName() {
    	  return this.lastName;
      }
      public String getName() {
    	  return this.firstName+" "+this.lastName;
      }
      public int getsalary() {
    	  return this.salary;
      }
      public void setsalary(int salary) {
		this.salary = salary;
	}
      public int getAnnualSalary() {
    	  return this.salary*12;
      }
      public int raiseSalary(int percent) {
    	  return ((this.salary*percent)/100)+this.salary;
      }
      public String toString() {
    	  return "Employee[id = "+this.id+",name = "+getName()+",salary = "+raiseSalary(salary)+"]";
      }

}
