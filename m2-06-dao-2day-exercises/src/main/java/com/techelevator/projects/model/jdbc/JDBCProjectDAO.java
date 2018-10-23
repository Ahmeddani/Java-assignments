package com.techelevator.projects.model.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Project;
import com.techelevator.projects.model.ProjectDAO;

public class JDBCProjectDAO implements ProjectDAO {

	private JdbcTemplate jdbcTemplate;

	public JDBCProjectDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	
	@Override
	public List<Project> getAllActiveProjects() {
		List<Project> projectList = new ArrayList<Project>();
		
		String sql = "select * from project where (from_date IS NOT NULL AND to_date > current_date) OR (from_date IS NOT NULL AND to_date IS NULL)";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sql);
		
		while (result.next()) {
			
			Project project = mapToProjectRows(result);
			projectList.add(project);
		}
		return projectList;
	}

	

	@Override
	public void removeEmployeeFromProject(Long projectId, Long employeeId) {
		
		String sql = "delete from project_employee where project_id = ? AND employee_id = ?";
		jdbcTemplate.update(sql, projectId, employeeId);
	}

	@Override
	public void addEmployeeToProject(Long projectId, Long employeeId) {
	
		try {
			String sql = "insert into project_employee (project_id, employee_id) values (?, ?)";
			jdbcTemplate.update(sql, projectId, employeeId);
		}catch(Exception e)
		{
			System.out.println("Employee already assigned to the project");
		}
	}
		
	
	private Project mapToProjectRows(SqlRowSet result) {
		List<Project> projectList = new ArrayList<Project>();
		Project project = new Project();
		project.setId(result.getLong("project_id"));
		project.setName(result.getString("name"));
		project.setStartDate(result.getDate("from_date").toLocalDate());		
		if (result.getDate("to_date") == null) {
			project.setEndDate(null);
			return project;
		}
		
			project.setEndDate(result.getDate("to_date").toLocalDate());
			return project;
		

		
	}

}
