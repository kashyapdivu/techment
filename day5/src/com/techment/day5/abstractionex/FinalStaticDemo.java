package com.techment.day5.abstractionex;

class Employee
{
	static String dept;
	final int id=1;
}

public class FinalStaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		Employee emp2 = new Employee();
		
		emp.dept = "CSE";
		emp2.dept = "Mech";
		
		System.out.println(emp.dept);
		System.out.println(emp2.dept);
	}

}
