package com.techment.day14.test2;

import java.util.Scanner;

class Person{
	
	private int id;
	private String name;
	private int age;
	
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}


class InvalidAgeException extends Exception {
	InvalidAgeException(String s) {
		super(s);
		//System.out.println("Your age is below 15");
	}

}

class LessThanException extends Exception {
	LessThanException() {
		
		System.out.println("Your age is below 15");
	}

}

public class Program6 {

	public static void main(String[] args) throws InvalidAgeException, LessThanException  {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Id: ");
		int id = scanner.nextInt();
		
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		scanner.nextLine();
		int nameLength = name.length();
		try {
	
		if(nameLength <= 3) {
			throw new LessThanException();
		}
		
		
		
		System.out.println("Enter your Age: ");
		int age = scanner.nextInt();
	      if(age>15) {
				Person person = new Person(id,name,age);
				System.out.println("Welcome, your are above 15 years");
			}else {
				throw new InvalidAgeException("Your age is below 15");
		      }
			
		}catch(InvalidAgeException e) {
			System.out.print("Invalid age ");
			  System.out.println(e.getMessage());
		}catch(LessThanException ex) {
			System.out.print("Invalid name ");
			  System.out.println(ex.getMessage());
		}
		
	}
	
	

}
