package com.obsqura.training.topic21;

public class Bike extends Engine {
	// overiding :-changing the fucntionality of paerent class method
	@Override
	public void startEngine(int milage) {
		value =90;
		type ="3000cc";
		System.out.println(type);
		if (milage > 500) {
			System.out.println(" Bike engine started");
		} else {
			System.out.println(" Bike Engine not started");
		}
	}
	
	public static void main(String[] args) {
		Engine obj;
		obj =new Bike();
		obj.startEngine(860);
		
		obj = new Engine();
		obj.startEngine(260);
		value =89;
		
		
		
	}
}
