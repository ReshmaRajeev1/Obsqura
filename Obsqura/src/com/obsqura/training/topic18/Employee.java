package com.obsqura.training.topic18;

public class Employee {
	String name = "Smith";
	public void displayVariable(int var) {
		display(this);// 'this' is equal to current class object reference
		System.out.println(var);
	}

	public void display(Employee emp) {
		System.out.println(name );
		
	}

	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.name = "pavithra";
		obj.displayVariable(5);
		System.out.println(obj.name);

	}
}
