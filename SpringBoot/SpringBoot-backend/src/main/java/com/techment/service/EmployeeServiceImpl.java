package com.techment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.model.Employee;
import com.techment.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

	private EmployeeRepository employeeRepository;
	//automatically autowired buy springBoot...
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}




	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}




	@Override
	public List<Employee> getEmployee() {
		return employeeRepository.findAll();
	}

}
