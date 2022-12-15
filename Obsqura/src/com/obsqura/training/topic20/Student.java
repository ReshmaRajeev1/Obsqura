package com.obsqura.training.topic20;

public class Student {

	String name;

	 Student() {
		System.out.println("Constructor");
	}

	 void display() {
		System.out.println(name);
	}

	public static void main(String[] args) {
		
		
		Student obj = new Student();
		obj.name = "Smith";
		obj.display();
	}

}
