package com.techment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.techment.model.Employee;

@Service 
public interface IEmployeeService{

	Employee saveEmployee(Employee employee);
	List<Employee> getEmployee();
	
}
