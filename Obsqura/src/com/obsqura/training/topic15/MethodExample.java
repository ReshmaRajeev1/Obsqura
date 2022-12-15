package com.obsqura.training.topic15;

public class MethodExample {

	// Static Method is a class level method
	  static void substraction() {
		System.out.println(5 - 6);
	}

	// Instance method is a object level method
	 void addition() {
		System.out.println(8 + 9);
	}

	public static void main(String[] args) {
		substraction();
		MethodExample obj = new MethodExample();
		obj.addition();
	}

}

/*
 * public : variables,Methods scope: from anywhere
 * private : with in a class
 * default : with in package
 * protected : with in package,id subclass outside the package
 */
