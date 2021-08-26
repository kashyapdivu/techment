package com.techment.day8.hashcode;

import java.util.HashMap;
import java.util.Map.Entry;

public class MaoDemo2 {

	public static void main(String[] args) {
		HashMap<String,String> hMap =new HashMap();
		hMap.put("sachin", "Sachin is a Cricketer");
		hMap.put("dhoni", "dhoni is a captain.");
		hMap.put("kohili", "virat is all rounder");
		hMap.put("rahane", "he is a batman.");
		hMap.put("kohili", "he is batsman.");
		
//	   System.out.println(hMap.keySet()); //return only key
//	   System.out.println(hMap.values());  //return only value.
//		System.out.println(hMap.entrySet()); //return entry set
		
		
		for(Entry<String, String> e : hMap.entrySet()) {
			System.out.println(e);  
			System.out.println("Keys:" +e.getKey()); //return only key
			System.out.println("Values: " +e.getValue());
		}
		
		System.out.println("Keys are\n");
		for(String key : hMap.keySet()) {
			System.out.println("Keys: " + key);
		}
		
		System.out.println("\nValues Are:");
		for(String val : hMap.values()) {
			System.out.println("Values: " +val);
		}
		
	}

}
