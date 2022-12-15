package com.obsqura.training.topic22;

public class Car extends Engine {
	int milage=800;
	// Overriding
	public int start() {
		System.out.println(super.milage +" Milage in parent class");
		int started = super.start();
		if (started == 1) {
			System.out.println("car started");
			return 1;

		} else {
			System.out.println("Car is not started");
		}
		return 0;
	}
	
	public void printCarName() {
		showDetails();
		System.out.println("NLINE");
	}

	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car.milage);
		car.start();	
		car.showDetails();
		car.printCarName();
	}

}
