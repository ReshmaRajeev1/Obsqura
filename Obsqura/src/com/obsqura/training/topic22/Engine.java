package com.obsqura.training.topic22;

public class Engine {
	int milage = 450;

	public int start() {
		if (milage > 400) {
			System.out.println("Engine is started");
			return 1;// started
		} else {
			System.out.println("Engine is not started");
		}
		return 0;// not started
	}
	
	public void showDetails() {
		System.out.println("It is a example of inhertiance");
	}

}
