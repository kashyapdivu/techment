package com.techment.classassignment;

 public class AccessSpecifierEx2 {
	 protected AccessSpecifierEx2() {
		 System.out.println("this is default Constructor..");
	 }
	 
	 protected AccessSpecifierEx2(String name) {
		 System.out.println("this is default Constructor with String Parameter.." + name);
	 }
	 
	 protected AccessSpecifierEx2(int a) {
		 System.out.println("this is default Constructor.." + a);
	 }
	 
	protected void msg(int a){
		System.out.println("Hello " + a);
		}  
}
