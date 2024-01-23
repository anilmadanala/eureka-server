package com.anil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anil.entity.Employee;
import com.anil.repo.EmployeeRepo;
@Service
public  class EmployeeServiceImp implements EmployeeService {
	
	 @Autowired
	private EmployeeRepo employeeRepo;
 
 

	@Override
	public EmployeeService getEmployeeById(Integer employeeId) {
		// TODO Auto-generated method stub
		return (EmployeeService) employeeRepo.findById(employeeId).orElse(null);
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepo.save(employee);
	}
	@Override
    public List<Employee> getAllEmployee() {
		List<Employee> emps= employeeRepo.findAll();
		return emps;
    }
	@Override
	public Employee getEmployeeByName(String name) {
		
		return employeeRepo.findByName(name);
	}
	

}
