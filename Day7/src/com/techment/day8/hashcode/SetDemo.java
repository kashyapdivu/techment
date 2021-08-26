package com.techment.day8.hashcode;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

         HashSet hs = new HashSet();
         hs.add(1);
         hs.add(20);
         hs.add(33);
         hs.add(4);
         hs.add(5);
         
         System.out.println("hashset" + hs);
	 
	     LinkedHashSet lhs = new LinkedHashSet();
	     lhs.add(111);
         lhs.add(20);
         lhs.add(33);
         lhs.add(4);
         lhs.add("Sachin");
	     
         System.out.println("hashset" + lhs);
         
         TreeSet ts = new TreeSet();
         ts.add(2);
         ts.add(25);
         ts.add(27);
         ts.add(2);
         
         System.out.println("TreeSet: "+ts);
         
         
         
         
         
         
    	 
	
	}

}
