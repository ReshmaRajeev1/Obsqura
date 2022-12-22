package com.obsqura.training.topic24;

public class Employee {
	String name;
	int age;
	Address address;

	public void display() {
		System.out.println("Name of the employee " + name);
		System.out.println("Age  of the employee " + age);
		System.out.println("Place  of the employee " + address.place);
		System.out.println("District of the employee " + address.district);

	}

	public Employee(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public static void main(String[] args) {

		Address addr = new Address("QC", "Washington");

		Employee emp = new Employee("Smith", 34, addr);
		emp.display();

		Address addr1 = new Address("QA", "America");

		Employee emp1 = new Employee("Smith", 34, addr);
		emp1.display();

	}

}
