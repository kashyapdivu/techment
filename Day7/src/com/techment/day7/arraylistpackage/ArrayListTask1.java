package com.techment.day7.arraylistpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

//take 2 list collection,merge the collection,remove duplicates,and sort in ascending order.

public class ArrayListTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> batch1 = new ArrayList<String>();
		batch1.add("Sachin");
		batch1.add("Ravi");
		batch1.add("Kumar");
		batch1.add("Sowmya");

		System.out.println("Batch 1: " + batch1);

		ArrayList<String> batch2 = new ArrayList<String>();
		batch2.add("Sourab");
		batch2.add("Manish");
		batch2.add("Sachin");
		batch2.add("Ankit");
		batch2.add("Kumar");

		System.out.println("Batch 2: " + batch2);

		// merging collection
		batch1.addAll(batch2);
		System.out.println("After Merging: " + batch1);
		
		ArrayList<String> arrObj = new ArrayList<String>();
		for(String element : batch1) {
			if(!arrObj.contains(element)) {
				arrObj.add(element);
			}
				
		}
		System.out.println("After Removing Duplicate: " +arrObj);

//		// removing duplicates...
//		Set<String> list3 = new HashSet<>();
//		list3.addAll(batch1);
//		list3.addAll(batch2);
//
//		System.out.println("After Removing Duplicate: " + list3);
//		
//		//converting Set into List
//		ArrayList<String> finalList = new ArrayList<String>(list3);

		// sort Collections...
		Collections.sort(arrObj);
		System.out.println("Sorted List: " + arrObj);
//		
		

	}

}
