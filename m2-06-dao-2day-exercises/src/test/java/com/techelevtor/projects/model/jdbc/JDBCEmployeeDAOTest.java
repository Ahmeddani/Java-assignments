package com.techelevtor.projects.model.jdbc;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.DepartmentDAO;
import com.techelevator.projects.model.Employee;
import com.techelevator.projects.model.jdbc.JDBCDepartmentDAO;
import com.techelevator.projects.model.jdbc.JDBCEmployeeDAO;

public class JDBCEmployeeDAOTest {

private static SingleConnectionDataSource dataSource;
private JDBCEmployeeDAO employeeDAO;
private JdbcTemplate jdbcTemplate;

private static final Long EMPLOYEE_ID = 13L;
private static final Long DEPARTMENT_ID = 1L;
@BeforeClass
public static void setupDataSource() {
	dataSource = new SingleConnectionDataSource();
	dataSource.setUrl("jdbc:postgresql://localhost:5432/projects");
	dataSource.setUsername("postgres");
	dataSource.setPassword("postgres1");
	dataSource.setAutoCommit(false);
}

@AfterClass
public static void closeDataSource() {
	dataSource.destroy();
}

@Before
public void setup() {
	employeeDAO = new JDBCEmployeeDAO(dataSource);
	jdbcTemplate = new JdbcTemplate(dataSource);
	String insertSql = "insert into employee (employee_id, department_id, first_name, last_name, birth_date,gender,hire_date)"
			+ " values (?, ?, 'Ahmed', 'Nur', DATE '1990-12-28', 'F', DATE '2011-08-01')";
	jdbcTemplate.update(insertSql, EMPLOYEE_ID, DEPARTMENT_ID);
}

@After
public void rollback() throws SQLException {
	dataSource.getConnection().rollback();
}

@Test
public void get_all_employees() {
	
	List<Employee> employeeList = employeeDAO.getAllEmployees();
	Assert.assertTrue(employeeList.size() > 0);
}

@Test
public void search_employees_by_name() {
	Employee employeeExpected = getEmployee(EMPLOYEE_ID, DEPARTMENT_ID, "Ahmed", "Nur", (LocalDate.of(1990,12,28)), 'F', (LocalDate.of(2011,8,01)));
	List<Employee> employeeList = employeeDAO.searchEmployeesByName("ahmeD", "nUr");
	Assert.assertTrue(employeeList.size() > 0);
	Employee employeeActual = new Employee();
	employeeActual = employeeList.get(0);
	assertEmployeesAreEqual(employeeExpected, employeeActual);

}

@Test
public void get_employees_by_department_id() {
	Employee employeeExpected = getEmployee(EMPLOYEE_ID, DEPARTMENT_ID, "Ahmed", "Nur", (LocalDate.of(1990,12,28)), 'F', (LocalDate.of(2011,8,01)));
	List<Employee> employeeList = employeeDAO.getEmployeesByDepartmentId(DEPARTMENT_ID);
	Assert.assertTrue(employeeList.size() > 0);
	for (Employee employee : employeeList) {
		if(employee.getId() == EMPLOYEE_ID) {
			Assert.assertTrue(true);
		}
	}
}

@Test
public void get_employees_with_out_projects() {
	Employee employee = new Employee();
	Employee employeeExpected = getEmployee(EMPLOYEE_ID, DEPARTMENT_ID, "Ahmed", "Nur", (LocalDate.of(1990,12,28)), 'F', (LocalDate.of(2011,8,01)));
	List<Employee> employeeList = employeeDAO.getEmployeesWithoutProjects();
	Assert.assertTrue(employeeList.size() > 0);
	for (Employee emp : employeeList) {
		if(emp.getId() == EMPLOYEE_ID) { // if expected department id is in the list assert true
			Assert.assertTrue(true);
		}
	}

}

@Test
public void get_employees_with__project_id() {
	Employee employee = new Employee();
	String insertSql = "insert into project_employee values (?,?)";
	jdbcTemplate.update(insertSql, 1, EMPLOYEE_ID);
	Employee employeeExpected = getEmployee(EMPLOYEE_ID, 1L, "Ahmed", "Nur", (LocalDate.of(1990,12,28)), 'F', (LocalDate.of(2011,8,01)));
	List<Employee> employeeList = employeeDAO.getEmployeesByProjectId(1L);
	Assert.assertTrue(employeeList.size() > 0);
	for (Employee emp : employeeList) {
		if(emp.getId() == EMPLOYEE_ID) { // if expected department id is in the list assert true
			Assert.assertTrue(true);
		}
	}

}

@Test
public void change_employee_with_department() {
	Employee employeeExpected = getEmployee(EMPLOYEE_ID, 1L, "Ahmed", "Nur", (LocalDate.of(1990,12,28)), 'F', (LocalDate.of(2011,8,01)));
	employeeDAO.changeEmployeeDepartment(EMPLOYEE_ID, 2L);
	List<Employee> employeeList = employeeDAO.searchEmployeesByName("Ahmed", "nur");
	Employee employeeActual = employeeList.get(0);
	Assert.assertEquals(2L, employeeActual.getDepartmentId());
	
	}

private void assertEmployeesAreEqual(Employee employeeExpected, Employee employeeActual) {
	Assert.assertEquals(employeeExpected.getDepartmentId(), employeeActual.getDepartmentId());
	Assert.assertEquals(employeeExpected.getFirstName(), employeeActual.getFirstName());
	Assert.assertEquals(employeeExpected.getLastName(), employeeActual.getLastName());
	Assert.assertEquals(employeeExpected.getBirthDay(), employeeActual.getBirthDay());
	Assert.assertEquals(employeeExpected.getGender(), employeeActual.getGender());
	Assert.assertEquals(employeeExpected.getId(), employeeActual.getId());
	Assert.assertEquals(employeeExpected.getHireDate(), employeeActual.getHireDate());
	
}

private Employee getEmployee(Long employee_id, Long department_id, String first_name, String last_name, LocalDate birth_date, char gender, LocalDate hire_date) {
	Employee employeeExpected = new Employee();
	employeeExpected.setId(employee_id);
	employeeExpected.setDepartmentId(department_id);
	employeeExpected.setFirstName(first_name);
	employeeExpected.setLastName(last_name);
	employeeExpected.setBirthDay((birth_date));
	employeeExpected.setHireDate((hire_date));
	employeeExpected.setGender(gender);
	return employeeExpected;
}
}
































