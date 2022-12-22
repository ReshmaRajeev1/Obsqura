package com.obsqura.training.assignments;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number limit");
		int value = sc.nextInt();
		printPrime(value);

	}

	public static boolean primeOrNot(int i) {
		for (int j = 2; j <= 9; j++) {
			if (i % j == 0 && i != j) {
				return false;
			}
				
		}
		return true;
	}

	public static void printPrime(int N) {
		System.out.println(2);
		for (int i = 3; i < N; i++) {
			if(primeOrNot(i)) {
				System.out.println(i);
			}
		}

	}
}
