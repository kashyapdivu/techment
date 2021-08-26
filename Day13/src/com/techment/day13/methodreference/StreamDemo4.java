package com.techment.day13.methodreference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class StreamDemo4 {

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(71);
		nums.add(21);
		nums.add(31);
		nums.add(41);
		System.out.println(nums);
			
		
		//nums.forEach(s->System.out.println(s));
		nums.forEach(System.out::println);
		
		System.out.println("By stream..");
		nums.stream().sorted().forEach(System.out::println);
	
	List<Integer> mySorted = nums.stream().sorted().collect(Collectors.toList());
	System.out.println(mySorted);
	
	System.out.println("reverse order");
	List<Integer> reverseSorted = nums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	
	System.out.println(reverseSorted);
	
	
	}

}
