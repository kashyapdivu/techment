package com.techment.day15.thread;

class Message extends Thread{
	
	public void run() {
		
		System.out.println("This is my task");
		
	}
	
}






public class CreatingThreadByExtendsThread {

	public static void main(String[] args) {
		
	Message msg  = new Message();	
		msg.start();
		
		
		
		
		
		
		
	}

}
