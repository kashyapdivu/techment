package com.techment.day7.arraylistpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> mList = new ArrayList<> ();
		mList.add(1);
		mList.add(2);
		mList.add(3);
		mList.add(4);
		mList.add(5);
		
		System.out.println("List1 = "+mList);
		
		Iterator<Integer> itr = mList.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
