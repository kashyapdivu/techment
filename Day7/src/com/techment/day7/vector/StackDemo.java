package com.techment.day7.vector;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		 Stack stack = new Stack();
	      stack.push("hii");
	      stack.push("hello");
	      stack.push("namaste");
	      stack.push("bye");
	      stack.add(2);
	      stack.add(33.44);
	      System.out.println("Stack List : "+stack);
	      System.out.println("Top Element : "+ stack.peek());	
		
	      stack.pop(); 
	      System.out.println("After Pop : "+stack);
	   
	      //peek : tells the value at peak
	     
	      System.out.println("Peek : "+ stack.peek());	
//			
	}

}
