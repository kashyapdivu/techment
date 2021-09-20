package com.techment.debug;

class Employee{
	int id;
	String name;
	int salary;
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	String display() {
		String msg ="Hii";
		name = msg.concat(" "+name);
		return "id : "+id+"\tname : "+name+"\tSalary: "+salary;
	}
	
	
}

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee1 = new Employee(1,"Vinayak",20000);
		String res1 = employee1.display();
		System.out.println(res1);
	
		Employee employee2 = null;
		String res2 = employee2.display();
		System.out.println(res2);
		
		
	}

}
