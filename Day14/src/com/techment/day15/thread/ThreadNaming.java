package com.techment.day15.thread;

class Apple extends Thread{
	
	public void run() {
		for(int i=1; i<=5 ; i++) {
//			if(i == 2) {
//				stop();
//			}
//			
			
		System.out.println("Eat Apple: "+ Thread.currentThread().getName());
	}
  }
} 

class Banana extends Thread{
	
	public void run() {
		for(int i =1; i <=5;  i++)
		   System.out.println("Eat Banana: "+ Thread.currentThread().getName());
	}
}



public class ThreadNaming {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Parent class of thread: "+Thread.currentThread().getName());
		Apple apple = new Apple();
		Banana banana = new Banana();
		
		//setting thread name
		apple.setName("Apple  Thread ");
		banana.setName("Banana Thread ");
		
		banana.setPriority(8);
		apple.setPriority(2);
		
		apple.start();
		banana.start();
		
		banana.suspend();  // blocked the thread...
		banana.resume();
	}

}
