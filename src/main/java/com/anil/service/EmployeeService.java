package com.anil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.anil.entity.Employee;

public interface EmployeeService {
	
	
	    EmployeeService getEmployeeById(Integer employeeId);
      
	    Employee saveEmployee(Employee employee);
	    List<Employee> getAllEmployee();
	    Employee deleteEmployee(Integer employeeId);
	    Employee findByNameEmployee(Employee employee);
	   
	}



