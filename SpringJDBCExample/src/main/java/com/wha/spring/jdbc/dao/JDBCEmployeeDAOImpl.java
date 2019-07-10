package com.wha.spring.jdbc.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.wha.spring.jdbc.model.Employee;

public class JDBCEmployeeDAOImpl implements CrudDAO {
	
	private DataSource dataSource ;
	private JdbcTemplate jdbcTemplate ;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;		
	}
	public void save(Employee employee) {
		String sql = "Insert into employee (id, name, role) values(?,?,?)";
		jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql, new Object[]{employee.getId(), employee.getName(), employee.getRole() });	
	}
	
	@SuppressWarnings("unchecked")
	public Employee getById(int id) {
		String sql = "select * from employee chere id = ?";
		jdbcTemplate = new JdbcTemplate(dtaSource);
		Employee employee = (Employee) jdbcTemplate.queryForObject(sql,  new Object[] {id}, new BeanPropertyRowManager(Employee.class));
		return employee;
	}
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		
	}
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
