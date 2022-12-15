package com.obsqura.training.topic21;

public class Engine {
	protected String type = "2000cc";
	public static int value =30;
	public void startEngine(int milage) {
		if (milage > 250) {
			System.out.println("engine started");
		} else {
			System.out.println("Engine not started");
		}
	}
}
