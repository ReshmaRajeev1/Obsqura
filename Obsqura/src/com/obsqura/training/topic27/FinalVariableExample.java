package com.obsqura.training.topic27;

public class FinalVariableExample {
	final int a ;
	FinalVariableExample(){
		a=100;
	}
	public void display(final int b) {
		System.out.println(b);
	}

	public static void main(String[] args) {

		FinalVariableExample obj = new FinalVariableExample();
		//System.out.println(obj.a);
		obj.display(10);
	}

}

