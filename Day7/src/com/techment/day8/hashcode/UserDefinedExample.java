package com.techment.day8.hashcode;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
	
	int id;
	String name;
	String dept;
	int age;
	public Employee(int id, String name, String dept, int age) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Employee Details: [id=" + id + ", name=" + name + ", dept=" + dept + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Employee o) {
		
		if(this.age > o.age)
			return 1;
		else if(this.age >o.age) {
			return 1;
		}else
			return -1;
	}
	
	
	
}

public class UserDefinedExample {

	public static void main(String[] args) {

    ArrayList<Employee> emp = new ArrayList<Employee>();
    emp.add(new Employee(1,"ramesh","hr",44));
    emp.add(new Employee(2,"suresh","manager",34));
    emp.add(new Employee(3,"mahesh","hr",54));
    emp.add(new Employee(4,"rajesh","developr",44));
    emp.add(new Employee(5,"dipesh","tester",24));
	
    System.out.println("********Before Sorting:********");
    for(Employee e : emp) {
    	System.out.println(e.id+" "+e.name+ " "+e.age+ " "+e.dept);
    }
	Collections.sort(emp);	


	  System.out.println("\n******After Sorting:********");
	    for(Employee e : emp) {
	    	System.out.println(e.id+" "+e.name+ " "+e.age+ " "+e.dept);
	    }
	
	}

}
