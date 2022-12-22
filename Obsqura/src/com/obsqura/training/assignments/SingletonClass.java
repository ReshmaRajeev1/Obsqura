package com.obsqura.training.assignments;

public class SingletonClass {
	private static SingletonClass obj;

	private SingletonClass() {
	}

	public static SingletonClass getInstance() {
		if (getInstance() == null) {
			obj = new SingletonClass();
			return obj;
		} else

			return obj;

	}
}
