package com.techment.day8.hashcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

class Student {
	
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Student other = (Student) obj;
		return age == other.age && id == other.id && Objects.equals(name, other.name);
	}
	
	
	
	
}

class AgeSorting implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.age > o2.age)
			return 1;
		else if(o1.age >o2.age) {
			return 1;
		}else
			return -1;

		
	}
	
	
	
}

class NameSorting implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
			return o1.name.compareTo(o2.name);

	}
	
}

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<Student> std = new  ArrayList();
	
	std.add(new Student(101,"ramesh",22));
	std.add(new Student(102,"saket",20));	
	std.add(new Student(103,"rojesh",21));
	std.add(new Student(104,"mahesh",19));
	std.add(new Student(105,"ram",24));
	
	for(Student s : std) {
		System.out.println(s);
	}
	
	Collections.sort(std,new AgeSorting());
	System.out.println("--------sorting by age----------");
	
	for(Student s : std) {
		System.out.println(s);
	}
	
	Collections.sort(std,new NameSorting());
	System.out.println("--------sorting by name----------");
	
	for(Student s : std) {
		System.out.println(s);
	}
	}
	
	}

	
	


