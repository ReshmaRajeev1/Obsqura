package com.obsqura.training.topic10;

import java.util.Scanner;

public class IfExample {
	public static void main(String[] args) {
		System.out.println("Enter your marks");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		if (marks >= 80) {
			System.out.println("Distinction");
		} else if (marks >= 60) {
			System.out.println("first class");
		} else if (marks >= 50) {
			System.out.println("second class");
		} else {
			System.out.println("Not passed");
		}
		
		System.out.println("Mark is "+marks);
	}

}
