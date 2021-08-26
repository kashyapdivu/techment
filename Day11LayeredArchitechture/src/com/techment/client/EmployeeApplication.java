package com.techment.client;

import java.util.List;
import java.util.Scanner;

import com.techment.modal.Employee;
import com.techment.service.EmployeeServiceImpl;
import com.techment.service.IEmployeeService;

public class EmployeeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
IEmployeeService service = new EmployeeServiceImpl();
		
		System.out.println("===========Employee Appliaction=========");
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("Enter the id to fetch employee");
		int id = scanner.nextInt();
		
		Employee employee = service.getEmployeeById(id);
		System.out.println(employee);
		
		System.out.println("Enter the dept to fetch employee");
		String dept = scanner.next();
		List<Employee>employees = service.getEmployeeByDept("hr");
		System.out.println(employee);
	}

}
