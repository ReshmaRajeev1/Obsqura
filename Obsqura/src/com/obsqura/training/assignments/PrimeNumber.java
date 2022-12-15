package com.obsqura.training.assignments;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		String result = null;
		for (int i = 2; i <= 9; i++) {
			if (value % i == 0 && value!=i) {
				result = "It is not a prime";
				break;
			} else {
				result = "It is a prime";
			}
		}
		System.out.println(result);
	}

}
