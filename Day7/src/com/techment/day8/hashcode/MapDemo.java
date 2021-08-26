package com.techment.day8.hashcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
	
	   
	   System.out.println("\nHashMap");
		Map<Integer,String> hashMap =new HashMap();
		hashMap.put(1, "ravi");
		hashMap.put(2, "rani");
		hashMap.put(3, "raja");
		hashMap.put(4, "hii");
		hashMap.put(5, "hello");
		
	   System.out.println(hashMap);
	   
	  System.out.println("\nLinkedHashMap:"); 
	  LinkedHashMap lMap =new LinkedHashMap();
	   lMap.put(1, 22.00);
	   lMap.put(2, 33.33);
	   lMap.put(3, 45.55);
		lMap.put(4, 66.44);
		lMap.put(5, 99.99);
		lMap.put(5, 00.99);
		
	   System.out.println(lMap);
	   
	   System.out.println("\nTreeHashMap:"); 
	   Map<String,Double> tMap =new TreeMap();
	   tMap.put("a", 122.00);
	   tMap.put("z", 233.33);
	   tMap.put("c", 345.55);
	   tMap.put("d", 466.44);
	   tMap.put("e", 599.99);
	   tMap.put("a", 122.00);
	   tMap.put("a", 152.00);
	   System.out.println(tMap);
	}

}
