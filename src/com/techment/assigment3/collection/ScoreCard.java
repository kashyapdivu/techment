package com.techment.assigment3.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;



import java.util.TreeMap;



public class ScoreCard {
	
	  public static <K, V extends Comparable<V>> K maxRunScorer(Map<K, V> map) {
	        Entry<K, V> maxEntry = Collections.max(map.entrySet(), new Comparator<Entry<K, V>>() {
	            public int compare(Entry<K, V> e1, Entry<K, V> e2) {
	                return e1.getValue()
	                    .compareTo(e2.getValue());
	            }
	        });
	        return maxEntry.getKey();
	    }

	
	public static void main(String[] args) {
		TreeMap<String,Integer> players =new TreeMap<String,Integer>();
		players.put("Rahane",20);
		players.put("Rahul", 30);
		players.put("Kohili", 150);
		players.put("Dhoni", 50);
		players.put("Lokesh", 2);
		
         System.out.println("Players who batted");
		
		for(String key : players.keySet()) {
			System.out.println(key);
		}
		
		int sum =0 ;
		System.out.println("\nScores by Players");
		for(Entry<String, Integer> e : players.entrySet()) {
		   System.out.println(e.getKey()+" : "+e.getValue()); //return only key
		    sum+= e.getValue();
		 
		}
		
		//key of high scorer
		
		System.out.println("\nName of Highest Scorer :  "+ maxRunScorer(players));
		
		//run score by dhoni..
		System.out.println("\nRun Score by Dhoni :  "+ players.get("Dhoni"));
				
	}

	

}
