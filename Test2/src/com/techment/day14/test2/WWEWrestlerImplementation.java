package com.techment.day14.test2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


class WWE{
	
	
	private String firstName;
	private String lastName;
	private int weight;
	public WWE(String firstName, String lastName, int weight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.weight = weight;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
}



public class WWEWrestlerImplementation {

	public static void main(String[] args) {
		List<WWE> wweList = new ArrayList<WWE>();
		wweList.add(new WWE("Ajay","Kushwaha",220));
		wweList.add(new WWE("Arun","Verma",200));
		wweList.add(new WWE("Vijay","Rai",190));
		wweList.add(new WWE("SnehKumar","Sharma",240));
		wweList.add(new WWE("Kush","Mishra",280));
		
		
		List<WWE> wwe =  wweList.stream().collect(Collectors.toList());
		WWEWrestlerImplementation wweClass = new WWEWrestlerImplementation();
		
		
		totalWrestler(wwe);
		sumOfWeight(wwe);
		printFirstName(wwe);
		minWeightWrestler(wwe);
		
	}

	private static void minWeightWrestler(List<WWE> wwe) {
		Optional<WWE> maxWeight = wwe.stream()
				.collect(Collectors.minBy(Comparator.comparing(WWE::getWeight)));

		WWE maximumWWE = maxWeight.get();
		System.out.println("\n MinWeight Wrestler : " + maximumWWE.getFirstName() + " " + maximumWWE.getLastName());

	}

	private static void printFirstName(List<WWE> wwe) {
		System.out.println("\nAll Wrestler First name: ");
		wwe.stream().map(WWE::getFirstName).forEach(System.out::println);
		
		
	}

	private static void sumOfWeight(List<WWE> wwe) {
		Long totalWeight= wwe.stream().filter(e->e.getWeight() > 200).collect(Collectors.summarizingInt(WWE :: getWeight)).getSum();
	  System.out.println("\nTotal weight of all Wrestler whose weight is above 200 : "+ totalWeight);
	}

	private static void totalWrestler(List<WWE> wwe) {
	  Long total =wwe.stream().count();
	  System.out.println("Total Wrestler : " + total);
	}

}
