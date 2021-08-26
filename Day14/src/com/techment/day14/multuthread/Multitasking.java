package com.techment.day14.multuthread;


class Sanika extends Thread{
	
	public void run() {
		for(int i =1;i<=10;i++) {
			System.out.println("Sanika "+i+ " msg : Welcome to Banglore.");
		}
	}
	
}


class Parul extends Thread{
	
	public void run() {
		
		for(int i =1;i<=5;i++) {
			
			if(i == 3) {
				try {
					Thread.sleep(5000);
				}catch(Exception w) {
					w.printStackTrace();
				}
			}
			
			
			System.out.println("Parul "+i+ " msg : Take vaccination.");
		}
	}
	
}


class Amit extends Thread{
	
	public void run() {
		for(int i =1;i<=5;i++) {
			System.out.println("Amit "+i+ " msg : Covd id not yet over.");
		}
	}
	
}


public class Multitasking {

	public static void main(String[] args) {
	
		
		Sanika sanika = new Sanika();
		Parul parul= new Parul();
		Amit amit = new Amit();
		
		//normal way
//		sanika.run();
//		parul.run();
//		amit.run();
//		
		
		sanika.start();
		parul.start();
		amit.start();
		
		
	}

}
