package com.anil.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anil.entity.Employee;
import com.anil.service.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	 
	@PostMapping("/path")
	public Employee  saveEmp(@RequestBody Employee emp) {
		Employee e = empService.saveEmployee(emp);
		return e;
	}
	@GetMapping("/getemp")
    public List<Employee> getAllEmployee() {
    return getAllEmployee();
    }
	
	}
	


