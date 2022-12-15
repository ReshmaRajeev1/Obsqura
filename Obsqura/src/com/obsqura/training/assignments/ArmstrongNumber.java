package com.obsqura.training.assignments;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int value = sc.nextInt();
		int digits = 0, temp;
		int rem, result = 0;
		temp = value;
		while (temp > 0) {
			temp = temp / 10;
			digits++;
		}

		temp = value;
		while (temp > 0) {
			rem = temp % 10;
			result = (int) (result + Math.pow(rem, digits));
			temp = temp / 10;

		}
		System.out.println(result);
		if (value == result) {
			System.out.println("It is a armstrong number");
		} else {
			System.out.println("It is not a armstrong number");
		}

	}
}
