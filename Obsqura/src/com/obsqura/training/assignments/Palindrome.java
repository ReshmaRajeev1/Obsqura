package com.obsqura.training.assignments;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Enter your number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int rem = 0, sum =0;
		/*
		 * while (number > 0) { rem = number % 10; number = number / 10;
		 * System.out.print(rem); }
		 */
		while (number > 0) {
			rem = number % 10;
			sum = sum * 10 + rem;
			number = number / 10;
			System.out.print(rem);
		}
		if (number == sum) {
			System.out.println("It is pandrome");
		}

	}

}
