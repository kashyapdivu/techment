package com.techment.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.techment.modal.Employee;
import com.techment.utility.CollectionUtil;

public class EmployeeDaoImpl implements IEmployeeDao {

	CollectionUtil collectionUtil = new CollectionUtil();
	
	@Override
	public Employee getEmployeeById(int id) {
		Map<Integer, Employee>empMap = collectionUtil.getEmployeeList();
		Employee employee = empMap.get(id);
		return employee;
	}

	public List<Employee> getEmployeeByDept(String dept) {
		
		//List is declared to store all the employee based on dept...
		List<Employee>empList = new ArrayList<Employee>();
		
		//it retur map data which contain details
		for(Employee employee : empList) {
			if(employee.getDept().equalsIgnoreCase(dept))
				empList.add(employee);
		}
		
		return empList;
	}

	
	
}
