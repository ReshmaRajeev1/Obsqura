package com.obsqura.training.topic15;

public class ParameterizedMethodExample {
	//Parameterized method
	void addition(int a, int b) {
		System.out.println(a+b);
	}
	//method with return type
	int substraction(int a,int b) {
		return a-b;
	}
	public static void main(String[] args) {
		ParameterizedMethodExample obj = new ParameterizedMethodExample();
		obj.addition(45, 14);
		int result = obj.substraction(78, 74);
		System.out.println(result);
		
	}

}
