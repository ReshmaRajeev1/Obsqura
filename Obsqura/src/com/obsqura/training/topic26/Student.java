package com.obsqura.training.topic26;

public class Student {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (this.age > 18)
			this.name = name;
		else
			System.out.println("age is less than 18");

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 18) {
			this.age = age;
		} else {
			System.out.println("age is less than 18");
		}
	}
	/*
	 * public void display(String name, int age) { if (age > 18) { this.age = age;
	 * this.name = name; System.out.println(this.name);
	 * System.out.println(this.age); } else {
	 * System.out.println("age is less than 18"); } }
	 */
}
