package com.techment.day15.thread;



class Info implements Runnable{

	@Override
	public void run() {
		System.out.println("This is my task");
	}
	
}



public class CreatingThreadByImplementsRunnable {

	public static void main(String[] args) {
		Info info = new Info();
		//info.run();
		
		Thread thread =  new Thread(info);
		thread.start();
		
	}

}
