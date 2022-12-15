package com.obsqura.training.topic22;

public class Student extends Division {
	
	public Student(String name, int age) {
		// TODO Auto-generated constructor 
		
		System.out.println("Name of student " + name);
		System.out.println("Age of student " + age);
	}

	public static void main(String[] args) {
		Student student = new Student("reshma", 30);

	}

}
