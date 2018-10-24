package com.techelevator.projects.model.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Employee;
import com.techelevator.projects.model.EmployeeDAO;

public class JDBCEmployeeDAO implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	public JDBCEmployeeDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	
	
	@Override
	public List<Employee> getAllEmployees() {
		
		List<Employee> employeeList = new ArrayList<Employee>();
		String getEmployeesSql = "select * from Employee";
		SqlRowSet result = jdbcTemplate.queryForRowSet(getEmployeesSql);
		
		while (result.next()) {
			
			Employee employee = mapToEmployeeRows(result);
			employeeList.add(employee);
		}
		
		return employeeList;
	}

	
	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
		
		
		List<Employee> employeeList = new ArrayList<Employee>();
		
		String sql = "select * from Employee where first_name ILIKE ? AND last_name ILIKE ?";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sql, firstNameSearch, lastNameSearch);
		
		while (result.next()) {
			
			Employee employee = mapToEmployeeRows(result);
			employeeList.add(employee);
		}
		return employeeList;
	}

	@Override
	public List<Employee> getEmployeesByDepartmentId(long id) {

		List<Employee> employeeList = new ArrayList<Employee>();
		String sql = "select * from Employee where department_id = ?";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sql, id);
		
		while (result.next()) {
			
			Employee employee = mapToEmployeeRows(result);
			employeeList.add(employee);
		}
		return employeeList;
	}

	@Override
	public List<Employee> getEmployeesWithoutProjects() {
		
		List<Employee> employeeList = new ArrayList<Employee>();
		String sql = "select * from employee where employee_id NOT IN (select employee_id from project_employee)";
		             
		SqlRowSet result = jdbcTemplate.queryForRowSet(sql);
		
		while (result.next()) {
			Employee employee = mapToEmployeeRows(result);
			employeeList.add(employee);
		}
		return employeeList;
	}

	@Override
	public List<Employee> getEmployeesByProjectId(Long projectId) {
		
		List<Employee> employeeList = new ArrayList<Employee>();
		String sql = "select * from employee where employee_id IN " 
				   + "(select employee_id from project_employee where project_id = ?)";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sql, projectId);
		while (result.next()) {
			
			Employee employee = mapToEmployeeRows(result);
			employeeList.add(employee);
		}
		
		return employeeList;
	}

	@Override
	public void changeEmployeeDepartment(Long employeeId, Long departmentId) {
		
		String sql = "update employee set department_id = ? where employee_id = ?";
		jdbcTemplate.update(sql, departmentId, employeeId);
		
	}
	
private Employee mapToEmployeeRows(SqlRowSet result) {
		Employee employee = new Employee();
		employee.setId(result.getLong("Employee_id"));
		employee.setDepartmentId(result.getLong("department_id"));
		employee.setBirthDay(result.getDate("Birth_date").toLocalDate());
		employee.setFirstName(result.getString("first_name"));
		employee.setLastName(result.getString("last_name"));
		employee.setGender(result.getString("gender").charAt(0));
		employee.setHireDate(result.getDate("hire_date").toLocalDate());
		return employee;
	}


}
