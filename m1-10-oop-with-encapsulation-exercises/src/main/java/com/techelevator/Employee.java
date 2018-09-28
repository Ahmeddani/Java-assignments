package com.techelevator;

public class Employee {

	private int employeeId;
	private String firstName;
	private String lastName;
	private String department;
	private double annualSalary;
	
	public Employee(int employeeId, String firstName, String lastName, double salary) {
		
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		annualSalary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getDepartment() {
		return department;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getFullName() {
		return this.lastName + ", " + this.firstName;
	}
	
	public void raiseSalary(double percent) {
		this.annualSalary = this.annualSalary + (this.annualSalary * percent / 100);
		
	}
}
