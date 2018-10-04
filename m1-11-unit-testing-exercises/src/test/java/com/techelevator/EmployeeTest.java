package com.techelevator;
import org.junit.After;
import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {

	Employee employee ;
	@Before
	public void setup() {
		 employee = new Employee(1, "Ahmed", "Ahmed", 300.0);
	}
	
	@Test
	public void check_for_positive_salary_raise() {
		employee.RaiseSalary(50.0);
		;
	}
	
	@Test
	public void check_for_negative_salary_raise() {
		employee.RaiseSalary(-50.0);
		Assert.assertFalse("Negative raise is allowed", false);
	}
}
