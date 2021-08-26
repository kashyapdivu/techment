package com.techment.day7.arraylistpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> mList = new ArrayList<> ();
		mList.add(1);
		mList.add(2);
		mList.add(3);
		mList.add(4);
		mList.add(5);
		
		System.out.println("List1 = "+mList);
		
		ListIterator<Integer> itr = mList.listIterator();
		

		System.out.println("Forward Direction");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Backward Direction");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
	}

}
