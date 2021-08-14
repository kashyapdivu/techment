package com.techment.task3.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class ScoreAnalyzer {
	
	List<Integer> runData = new LinkedList<Integer>();
	
	public ScoreAnalyzer(List<Integer> list) {
		this.runData = list;
	}

	void addRunsToList (){
		
	}
	
	/*Create a method calcRunRate which returns the runRate 
	 * (Consider all 50 overs were played by a team).
	 * */
	double calcRunRate() {
		double runRate ;
		int sum = 0;
		
		for(Integer i : runData) {
			sum+= i;
		}
		
		runRate = sum/50;
		return runRate;
	}
	
	Integer lowestRunsScored () {
		 Collections.sort(runData);
		//System.out.println("\nLowest Runs : "+runData.get(0));
		return runData.get(0);
	}
	
	void displayRuns(){
		int i =1;
		System.out.print("Runs Scored : ");
		for(Integer in : runData) {
			System.out.print(i+"-"+in+"\t");
			i++;
		}
	}
	
}





public class Program2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many players are there: ");
        int players = scan.nextInt();
		
        List<Integer> list =  new LinkedList<Integer>();
        System.out.println("Enter Runs");
        for(int i =0; i<players ; i++) {
        	list.add(scan.nextInt());
         }
        
        ScoreAnalyzer scoreAnalyzer = new ScoreAnalyzer(list);
        //displaying runs
        scoreAnalyzer.displayRuns();
       double rr= scoreAnalyzer.calcRunRate();
       System.out.printf("\nRunRate :  "+String.format("%.2f", rr)); 
       int lw = scoreAnalyzer.lowestRunsScored();
       System.out.println("\nLowest Runs : "+lw);
		
      System.out.println("Count of player who batted: "+players);
	}

}
