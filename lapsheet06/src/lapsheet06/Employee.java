package lapsheet06;

import java.util.DuplicateFormatFlagsException;

public class Employee {
	private String name;
	private int hoursWorked;
	private double hourlyRate;
	
	public void setEmployeeDetails(String empName, int hours, double rate) {
		name = empName;
		hoursWorked = hours;
		hourlyRate = rate;
	}
	
	public double calculateSalary() {
		double salary = hoursWorked * hourlyRate;
		if (hourlyRate > 40) {
			double bonus = salary*0.10;
			salary += bonus;
		}
		return salary;
	}
	public void displayEmployeeDetails() {
		System.out.println("Name: "+ name);
		System.out.println("Hours Worked: "+ hoursWorked);
		System.out.println("hourly Rate: "+ hourlyRate);
		System.out.println("Total Salary: "+ calculateSalary());
	}

}
