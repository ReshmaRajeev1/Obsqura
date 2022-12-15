package com.obsqura.training.topic18;

public class Student1 {
	String name = "reshma";
	int age;
	char grade;

	Student1() {
		System.out.println("default constructor");

	}

	Student1(int age) {
		this(29, 67);
		this.age = age;

	}

	Student1(int age, int marks) {

		this.age = age;
	}

	Student1(char grade) {
		this.grade = grade;
		// intance variable grade ='A';

	}

	public static void main(String[] args) {

		Student1 obj = new Student1(24);

		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.grade);
	}

}
