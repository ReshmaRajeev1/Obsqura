package com.obsqura.training.assignments;

public class BubbleSort {
	public static void main(String[] args) {
		int[] numbers = { 9, 1, 8, 2, 7, 3, 4, 5, 6 };
		int length = numbers.length;
		int temp;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (numbers[i] > numbers[j]) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;

				}
			}
		}
		for (int number : numbers) {
			System.out.println(number);
		}
	}

}
