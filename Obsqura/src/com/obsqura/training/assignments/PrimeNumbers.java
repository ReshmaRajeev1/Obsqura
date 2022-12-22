package com.obsqura.training.assignments;

public class PrimeNumbers {
	public static void main(String[] args) {
		primeNumber(19);
	}

	public static void primeNumber(int n) {
		int flag = 0;
		for (int i = 2; i < 19; i++) {
			for (int j = 2; j < 19; j++) {
				flag = 0;
				if (i % j == 0 && i != j) {
					flag = 1;
					break;
				}

			}
			if (flag != 1) {
				System.out.println(i);

			}

		}
	}

}
