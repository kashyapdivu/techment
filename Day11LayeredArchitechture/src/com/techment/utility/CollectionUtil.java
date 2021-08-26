package com.techment.utility;

import java.util.HashMap;
import java.util.Map;

import com.techment.modal.Employee;

public class CollectionUtil {

	static Map<Integer, Employee> employees =  new HashMap<Integer, Employee>();
	
	static {
		employees.put(1, new Employee(1,"ravi","hr",3000));
		employees.put(2, new Employee(2,"john","manager",3000));
		employees.put(3, new Employee(3,"meena","developer",3000));
		employees.put(4, new Employee(4,"ram","hr",3000));
		employees.put(5, new Employee(5,"shyam","hr",3000));
	}

	/*
	 * this meethod is used to get employee map whih we initialize
	 * as static data
	 */
	
	public static Map<Integer ,Employee> getEmployeeList(){
		
		return employees;
	}
}
