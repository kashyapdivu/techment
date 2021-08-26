package com.techment.day13.methodreference;

@FunctionalInterface
interface A{
	Student getStudentDetails();
	
}


class Student{
	int id;
	String name;
	
	void display() {
		
		System.out.println("This is student info...");
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

public class ConstructorReference {

	public static void main(String[] args) {
//by using lambda 
       A a = ()->{;
	        Student s  = new Student();
	        return s;
       };
       
       A a1 = ()->new Student();
       a1.getStudentDetails().display();
       
       
       //by using method reference
       
       A obj = Student:: new ;
       obj.getStudentDetails().display();
       
	}

	
}
