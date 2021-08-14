package com.techment.task3.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;


class Patient {
	private int patientId;
	private String name;
	private int age;
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
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
	public Patient(int patientId, String name, int age) {
		super();
		this.patientId = patientId;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}


class NameSorting implements Comparator<Patient>{

	@Override
	public int compare(Patient o1, Patient o2) {
		
			return o1.getName().compareTo(o2.getName());

	}
	
}

class AgeSorting implements Comparator<Patient>{

	@Override
	public int compare(Patient o1, Patient o2) {
		if(o1.getAge() > o2.getAge())
			return 1;
		else if(o1.getAge() >o2.getAge()) {
			return 1;
		}else
			return -1;

		}
	}

public class TestPAtientList {

	public static void main(String[] args) {

		Patient p1 = new Patient(1,"ravi",74);
		Patient p2 = new Patient(2,"preeti",40);
		Patient p3 = new Patient(3,"meena",34);
		
		LinkedList<Patient> patient =  new LinkedList<Patient>();
		patient.add(p1);
		patient.add(p2);
		patient.add(p3);
		
		Collections.sort(patient ,new NameSorting() );
		System.out.println("Sorted By Name");
		
        Iterator<Patient> itr = patient.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collections.sort(patient ,new AgeSorting() );
		System.out.println("Sorted By Age");
		
        Iterator<Patient> itr1 = patient.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		System.out.println("TreeSet");
		TreeSet<Patient> tp = new TreeSet<Patient>(patient);
		tp.add(p1);
		tp.add(p2);
		tp.add(p3);
	//	System.out.println(tp);

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter patient name: ");
	     String patientName = scan.nextLine();
	  
	     //take patient name and show age
	     getPatientAge(patientName , tp);
	 
	}

	private static void getPatientAge(String patientName, TreeSet<Patient> tp) {

		boolean flag =  false;
        for(Patient p : tp) {
        	if(p.getName() == patientName) {
        		System.out.println(patientName+" age is: "+ p.getAge());
        	}
        }
		
	}

	

	

	
	
}
