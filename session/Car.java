package com.techment.session;


class CarFeature{
	String color;
	int speed;
	int model;
	
	CarFeature(int model ,int speed,String color){
		this.model = model;
		this.color = color;
		this.speed = speed ;
	}
	
	 String carSpeed(int speed) {
		if(speed>=10 && speed <=60)
			return "Car is in Avg Speed";
		else if(speed> 70)
			return "Car is in Fast Speed";
		
		return "Car Stopped...";
	}
	 
	 public void CarDetails() {
		  System.out.println("Car Details\n"
		  		+ "Model: "+model+ 
		  		"\nColor: "+color+ 
		  		"\nSpeed: "+speed+"\n");
	  }
	  
}

public class Car {

	public static void main(String[] args) {
		CarFeature audi = new CarFeature(111,70,"red");
		CarFeature benz = new CarFeature(112,110,"black");
		
		audi.CarDetails();
		benz.CarDetails();
		
		System.out.println(audi.carSpeed(40));
		System.out.println(benz.carSpeed(130));

	}

}
