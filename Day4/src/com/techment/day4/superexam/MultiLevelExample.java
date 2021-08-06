package com.techment.day4.superexam;

class Doctor{
	
	void doctor_details() {
		System.out.println("Doctor Details");
	}
}

class GynoDoctor extends Doctor{
	
	void gyno_details() {
		System.out.println("This is Gynologist-Doctor");
	}
}

class DoctorTiming extends GynoDoctor{
	
	void time_details() {
		System.out.println("Available from 10:00am to 8:00pm .\n");
	}
}

class OrthoDoctor extends Doctor{
	
	void ortho_details() {
		System.out.println("This is Orthologist-Doctor.\n");
	}
}


public class MultiLevelExample {

	public static void main(String[] args) {

		DoctorTiming dt = new DoctorTiming();
		dt.doctor_details();
		dt.gyno_details();
		dt.time_details();
		
//		CardioDoctor cardioObj = new CardioDoctor();
//		cardioObj.doctor_details();
//		cardioObj.cardio_details();

//		OrthoDoctor ortooObj = new OrthoDoctor();
//		ortooObj.doctor_details();
//		ortooObj.ortho_details();
	}

}
