package com.techment.day8.strings;

public class StringDemo {

	public static void main(String[] args) {
		
		String s1 = "hello";   //by literal
		String s2 = "hello";
		String s3 = new String("hello");	//by new
		String s4 = new String("hello");
		
		
		System.out.println(s1 == s2); //== check the address and literal are in constant pool
		System.out.println(s1.equals(s2));
		
		System.out.println(s3 == s4); //== check the address and s3 ,s4 are in different addres by new keyword
	
	
		System.out.println(s3.equals(s4));
	
	}

}
