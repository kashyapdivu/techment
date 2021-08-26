package com.techment.day7.arraylistpackage;

import java.util.ArrayList;
import java.util.ListIterator;

public class EnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> mList = new ArrayList<> ();
		mList.add(1);
		mList.add(2);
		mList.add(3);
		mList.add(4);
		mList.add(5);
		
		System.out.println("List1 = "+mList);
		
		//ListIterator<Integer> itr = mList.listIterator();
		
		for(Integer element : mList) {
		
			System.out.println(element);
	
		}
	}

}
