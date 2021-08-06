package com.techment.day5.interfaceex;

interface One
{
	void greet1() ;
}

interface Two
{
	void greet2() ;
}

class Employee implements One,Two
{

	@Override
	public void greet2() {
		
		
	}

	@Override
	public void greet1() {
		
		
	}
	
}

class Manager{
	void operationOnRegion() {
		
	}
}

public class InterfaceDemos extends Manager implements One,Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void greet2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void greet1() {
		// TODO Auto-generated method stub
		
	}

}
