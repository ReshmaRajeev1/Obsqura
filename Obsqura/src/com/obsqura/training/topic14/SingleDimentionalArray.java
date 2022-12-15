package com.obsqura.training.topic14;

public class SingleDimentionalArray {
	public static void main(String[] args) {
		// Two ways to declare an array
		int[] numbers = { 2, 3, 4, 5 };//declaration,instantiation,intilization
		int[] values = new int[4];//declaration,instantiation
		values[0] = 9;
		values[1] = 4;
		values[2] = 6;
		values[3] = 5;
		int size = numbers.length;
		
		for(int i=0;i<size;i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("----------------");
		for(int value : values) {
			System.out.println(value);
		}

	}

}
