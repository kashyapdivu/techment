package com.techment.day7.arraylistpackage;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList o1 = new LinkedList();
		o1.add(1);
		o1.add(2);
		o1.addFirst(0);
		o1.addLast(7);
		
		o1.peek();
		System.out.println(o1);
		o1.remove(2);
		System.out.println(o1);
	}

}
