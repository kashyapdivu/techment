package com.techment.day14.test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Program5 {

	public static void main(String[] args) {
Map<Integer,Integer> voterMap =new HashMap();
		voterMap.put(1, 20);
		voterMap.put(2, 5);
		voterMap.put(3, 44);
		voterMap.put(4, 32);
		voterMap.put(5, 65);
		voterMap.put(6, 9);
		voterMap.put(7, 90);
		voterMap.put(8, 15);
		voterMap.put(9, 29);
		voterMap.put(10, 19);
		
		List<Integer> listOfVoters = voterList(voterMap);
		
	  System.out.println("Valid Voters Id are : ");
		for(Integer voterId : listOfVoters) {
			System.out.println(voterId);
		}
		
	}

	private static List<Integer> voterList(Map<Integer, Integer> voterMap) {
		List<Integer> validVoter = new ArrayList<Integer>();
		for(Entry<Integer, Integer> entry : voterMap.entrySet()) {
			if(entry.getValue() > 18) 
			   validVoter.add(entry.getKey());
			}

		return validVoter;
	}

	
}
