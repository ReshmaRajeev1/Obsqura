package com.obsqura.training.topic26;

public class SingletonClass {
	private static SingletonClass obj;

	private SingletonClass() {

	}

	public static SingletonClass getInstance() {
		if (obj == null) {
			obj = new SingletonClass();
		}
		return obj;
	}
	

}
