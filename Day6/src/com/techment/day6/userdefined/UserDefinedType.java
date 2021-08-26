package com.techment.day6.userdefined;

import java.util.ArrayList;

public class UserDefinedType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 =  new Employee(1,"sachin","HR");
		Employee emp2 =  new Employee(2,"sachin","Hr");
		
		ArrayList<Employee> employee = new ArrayList<Employee>();
		employee.add(emp1);
		employee.add(emp2);
		employee.add(new Employee(3,"Priya","Developer"));
 
//		for(Employee emp : employee) {
//			
//			System.out.println(emp.id+"  "+emp.name+" "+emp.dept);
//		}
//	
	
for(Employee emp : employee) {
			if(emp.getId()>2)
				emp.setDept("manager");
			
			System.out.println(emp.getId()+"  "+emp.getName()+" "+emp.getDept());
		}
	
	}

}
