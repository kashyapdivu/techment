package com.techment.day13.methodreference;

import java.util.ArrayList;
import java.util.Comparator;

//class Student{
//	
//	
//}

//class AgeComparator implements Comparator<Employee>{
//
//	@Override
//	public int compare(Employee o1, Employee o2) {
//		if(o1.getAge() == o2.getAge())
//		    return 0;
//	}
//	
//	
//	
//}




public class StreamSortDemo {

	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee(1, "sachin", "developer", 2000, 20));
		employees.add(new Employee(2, "kumar", "hr", 78000, 70));		
		employees.add(new Employee(3, "mitali", "developer", 9000, 30));
		employees.add(new Employee(4, "kavya", "manager", 12000, 44));
		employees.add(new Employee(5, "som", "developer", 2000, 28));
	
	
	employees.forEach(System.out::println);
	
//	employees.stream().sorted(new AgeComparator()).forEach(System.out::println);
//	
	System.out.println("Sorted by age");
	employees.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);
	
	System.out.println("Sorted by name");
	employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
	
	
	System.out.println("Sorted by salary");
	employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);
	
	
	
	}
}
