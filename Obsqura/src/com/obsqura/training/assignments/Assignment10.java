package com.obsqura.training.assignments;

import java.util.Scanner;

public class Assignment10 {
	public static void main(String[] args) {
		System.out.println("Enteryour mark");
		Scanner sc = new Scanner(System.in);
		int mark = sc.nextInt();
		if (mark>80) {
			System.out.println("Your grade is A");
		} else if (mark >70) {
			System.out.println("Your grade is B");
		} else if (mark >60) {
			System.out.println("Your grade is C");
		} else if (mark >=40) {
			System.out.println("Your grade is D");
		} else
			System.out.println("You are failed");
	}
}
