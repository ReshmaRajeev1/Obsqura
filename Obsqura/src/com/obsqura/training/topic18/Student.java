package com.obsqura.training.topic18;

public class Student {
	public void displayName() {
		System.out.println("Name : Jai");
	}

	public void displayRollNo() {
		System.out.println("Roll Number : 34");
	}

	public void displayMarks() {
		this.displayName();
		this.displayRollNo();
		System.out.println("Marks : " + 90);

	}

	public static void main(String[] args) {
		Student obj = new Student();

		obj.displayMarks();
	}

}
