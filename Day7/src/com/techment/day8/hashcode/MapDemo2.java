package com.techment.day8.hashcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student1 =  new Student(1,"Sachin",9);
		Student student2 =  new Student(1,"Sachin",9);
	
	System.out.println(student1.hashCode());
	System.out.println(student2.hashCode());
	
	
	HashMap<Student,String> hm = new HashMap<Student , String>();
	hm.put(new Student(1,"Sachin",9),"cse");
	hm.put(new Student(2,"Sachin",9),"cse");
	
	for(Entry<Student, String> std : hm.entrySet()) {
		System.out.println(std);
	 }

	}

}
