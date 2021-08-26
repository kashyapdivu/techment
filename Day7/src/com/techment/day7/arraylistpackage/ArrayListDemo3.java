package com.techment.day7.arraylistpackage;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<Integer> a1 = new ArrayList<Integer>(); 
	a1.add(1);
	a1.add(2);
	a1.add(3);
	a1.add(4);
	a1.add(5);
	
	System.out.println("Elements are: "+ a1);
	
	ArrayList<Integer> a2 = new ArrayList<Integer>(); 
	a2.add(100);
	a2.add(200);
	a2.add(3);
	a2.add(5);
	System.out.println("Elements are: "+ a2);
	
//	a1.addAll(a2);
//	System.out.println("Merged Element: "+ a1);
	
	a2.removeAll(a1); //remove all elemnt from a2 which is available in a1.
		System.out.println("Remove Element: "+ a2);
	
	//a2.retainAll(a1);
	//System.out.println("After retain:" +a2);
	
	Collections.sort(a2);
	System.out.println("After sorting a2 elemnt: "+a2);
	
	
	}

}
