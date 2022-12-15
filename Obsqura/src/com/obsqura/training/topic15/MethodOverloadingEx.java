package com.obsqura.training.topic15;

public class MethodOverloadingEx {
	 MethodOverloadingEx() {
		// TODO Auto-generated constructor stub
		System.out.println("constructor");
		int a=3+4;
	}
	 MethodOverloadingEx(int a, int b) {
			// TODO Auto-generated constructor stub
			System.out.println(" parametrised constructor");
			System.out.println(a+b);
		}
	 
	void addition() {
		System.out.println(2 + 3);
	}

	void addtion(int a, int b) {
		System.out.println(a + b);
	}
	
	void addtion(int a, int b, int c) {
		System.out.println(a + b);
	}

	void addition(int a, float b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		MethodOverloadingEx obj = new MethodOverloadingEx();
		
		obj.addition();
		obj.addition(2, 3);
		obj.addition(1, 1.4f);
		obj.addtion(3, 4, 5);
		MethodOverloadingEx obj1 = new MethodOverloadingEx(4,6);
		obj1.addition();
		obj1.addition(21, 3);
		obj1.addition(11, 1.4f);
		obj1.addtion(13, 4, 5);
		
	}
}
