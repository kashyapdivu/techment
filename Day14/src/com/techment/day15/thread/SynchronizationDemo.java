package com.techment.day15.thread;

class Water{
	 public void drinkWater(int time) {
		
		 synchronized(this) {
			 for(int i =1 ; i <= time ; i++) {
				System.out.println(Thread.currentThread().getName()+ " is drinking water");;
			  }
		 }
		for(int i =1 ; i <= time ; i++) {
			System.out.println(Thread.currentThread().getName()+ " is eating "+i+"times");;
		}
	 
	 }
}

class WaterBottle extends Thread{

	Water water = new Water();
	
	@Override
	public void run() {

      water.drinkWater(5);
		
		
	}
	
	
}


public class SynchronizationDemo {

	public static void main(String[] args) {
    
       WaterBottle waterBottle = new WaterBottle();
		Thread person1 = new Thread(waterBottle);
		Thread person2 = new Thread(waterBottle);
		Thread person3 = new Thread(waterBottle);
		
		person1.setName("Person 1 ");
		person2.setName("Person 2 ");
		person3.setName("Person 3 ");
		
		person1.start();
		person2.start();
		person3.start();
		
		
	}

}
