package com.techment.day7.arraylistpackage;

import java.util.ArrayList;

public class ModifyingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1 = new ArrayList<Integer>(); 
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		
		System.out.println("Elements are: "+ a1);
		
		for(int i : a1) {
			if(i>3) {
				a1.remove(i);
			}
			System.out.println(i);	
		}
	}

}
