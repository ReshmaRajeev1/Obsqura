package com.obsqura.training.topic15;

public class MethodOverloadingEx {

	void addition() {
		System.out.println(2 + 3);
	}

	void addtion(int a, int b, int c) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		MethodOverloadingEx obj = new MethodOverloadingEx();
		obj.addition();
		obj.addtion(3, 4, 5);

	}
}
