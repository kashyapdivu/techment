package com.techment.day5.car_enginetask;

class Car{
	
	String name;
	String model;
     Engine engine; //object reference
     
	public Car(String name, String model, Engine engine) {
		super();
		this.name = name;
		this.model = model;
		this.engine = engine;
	}
     


	void carDetails() {
    	 System.out.println("Car Details: ");
    	 System.out.println("Name: "+name);
    	 System.out.println("Model: "+model);
    	 System.out.println("Engine Id: "+engine.engineID);
    	 System.out.println("Engine Type: " + engine.engineType);
    	 System.out.println();
     }
}

class Engine{
	int engineID;
	int engineType;
	public Engine(int engineID, int engineType) {
		super();
		this.engineID = engineID;
		this.engineType = engineType;
	}
}

public class CarEngineTask {
	public static void main(String[] args) {
		  
		Engine engine =  new Engine(101,2);
		
		Car audi = new Car("Audi","Audi 100",engine);
		
		audi.carDetails();
		
       Engine engine2 =  new Engine(201,2);
		
		Car benz = new Car("Benz","Benz 100",engine2);
		
		benz.carDetails();
	}

}
