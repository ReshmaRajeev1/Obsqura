package com.obsqura.training.topic9;

public class InstanceVariableExample {
	int sum;

	public void add() {
		int a, b;
		a = 10;
		b = 20;
		sum = a + b;
	}

	public void display() {
		System.out.println(sum);
	}

	public static void main(String[] args) {
		InstanceVariableExample obj = new InstanceVariableExample();
		obj.add();
		obj.display();

	}
}
