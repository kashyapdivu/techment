package com.techment.day13.methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streamdemo5 {

	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee(1, "sachin", "developer", 2000, 20));
		employees.add(new Employee(2, "kumar", "hr", 78000, 70));		
		employees.add(new Employee(3, "mitali", "developer", 9000, 30));
		employees.add(new Employee(4, "kavya", "manager", 12000, 44));
		employees.add(new Employee(5, "som", "developer", 2000, 28));
	
		
		employees.stream().map(e->e.getSalary()+ e.getSalary()*0.20).forEach(System.out::println);;
	
		//List<String> li = employees.stream().map(e->"name "+e.getName()+"salary "+e.getSalary()).forEach(System.out::println);
		
		List<Employee> li = employees.stream().collect(Collectors.toList());
		
		Streamdemo5 streamdemo5= new Streamdemo5();
		double hrSalary= streamdemo5.deptWiseSumSalary(employees, "developer");
		System.out.println("total hr salary sum :" +hrSalary);
		
	}
	
	double deptWiseSumSalary(ArrayList<Employee> employees,String dept) {
		
		double sumSalary = employees.stream().
				filter(e->e.getDept().equals(dept)).collect(Collectors.summarizingDouble(Employee::getSalary)).getSum();
		return sumSalary;
	}

}
