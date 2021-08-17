package com.techment.assigment3.collection;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Program5 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("states.txt");
		file.createNewFile();  // create file states.txt
		System.out.println(file.exists());  // check file exists or not. 
		
		FileWriter  fw = new FileWriter("states.txt");
		BufferedWriter bw = new BufferedWriter(fw); 
		bw.write("Karnataka");
		bw.newLine();
		bw.write("Punjab");
		bw.newLine();
		bw.write("Telangana");
		bw.newLine();
		bw.write("Maharashtra");
		bw.newLine();
		bw.write("TamilNadu");
		bw.newLine();
		bw.write("Uttar Pradesh");
		bw.newLine();
		bw.write("Punjab");
		bw.newLine();
		bw.write("Karnataka");
		bw.newLine();
		bw.write("Kerala");
		bw.newLine();
		bw.write("Delhi");
		bw.newLine();
		bw.flush();
		bw.close();
		
		LinkedHashSet<String>stateSet = new LinkedHashSet<String>();  
		
		BufferedReader br = new BufferedReader(new FileReader("states.txt"));
		String line = br.readLine();
		
		System.out.println("          State List        ");
		System.out.println("----------------------------");
		while(line != null) {
			stateSet.add(line);
			System.out.println(line);
			line = br.readLine();
		}
		
		//display total state 
		System.out.println("\nTotal number of states: "+stateSet.size());
		
		//remove delhi from set
		System.out.println("\n List after Remove Delhi from the Set");
		System.out.println("-----------------------------------------");
		stateSet.remove("Delhi");
		for(String s : stateSet) {
			System.out.println(s);
			
		}
		
		//display the states starts with 'K'
		System.out.println("\nStates which have name starting with K");
		System.out.println("-------------------------------------------");
		for(String s : stateSet) {
			if(s.startsWith("K")) {
				System.out.println(s);
			}
		}
		
		//Display the states in a sorted Order
		System.out.println("\n\n      New Sorted list:           ");
		System.out.println("----------------------------------");
		TreeSet<String> ts = new TreeSet<String>(stateSet);
	//	System.out.println(ts);
		for(String e : ts) {
			System.out.println(e);
		}
		
	}

}
