package com.techment.day8.strings;

public class Immutable {

	public static void main(String[] args) {
		
		String courseName = "Java";
		System.out.println("course name: " +courseName);
		
		courseName.concat("programming");
		System.out.println("After concat: "+courseName);
	//we cannot change string in java 
		
		courseName=courseName.concat(" programming");
		System.out.println("After concat: "+courseName);
		
	}

}
