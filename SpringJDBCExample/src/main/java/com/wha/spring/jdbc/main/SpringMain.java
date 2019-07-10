package com.wha.spring.jdbc.main;

import java.util.List;
import java.util.Random;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wha.spring.jdbc.dao.CrudDAO;
import com.wha.spring.jdbc.model.Employee;

public class SpringMain {

	public static void main(String[] args) {
		
//Get the Spring context
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Get the employee DAO bean
		CrudDAO employeeDAO = ctx.getBean("jdbcEmployeeDAO", CrudDAO.class);
		//Run some tests for JDBC CRUD operations
		Employee emp = new Employee();
		int rand = new Random().nextInt(1000);
		emp.setId(rand);
		emp.setName("Pankaj");
		emp.setRole("Java Developer");
		employeeDAO.save(emp);
		ctx.close();
		//Read
		/*Employee emp1 = employeeDAO.getById(rand);
		System.out.println("Employee retrieved :  " + emp1);*/
		}
}
 