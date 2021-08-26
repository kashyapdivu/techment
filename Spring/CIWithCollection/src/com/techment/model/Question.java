package com.techment.model;

import java.util.List;

public class Question {
	
	private int id;  
	private String name;  
	private List<String> answers;
	
	
	public Question(int id, String name, List<String> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	} 
	
	public void displayAnswers() {
		System.out.println("Name: "+name);
		System.out.println("answers: "+answers);
	}
	

}
