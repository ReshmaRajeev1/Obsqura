package com.obsqura.training.assignments;

import java.util.Scanner;

public class Assignment33ClassC {
	int totalSalary;

	public static void main(String[] args) {
		Assignment33ClassA classA = new Assignment33ClassA();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter basic pay");
		classA.basicPay = sc.nextInt();
		System.out.println("Enter dedection");
		classA.dedection = sc.nextInt();
		System.out.println("Enter bonus");
		classA.bonus = sc.nextInt();

		Assignment33ClassB classB = new Assignment33ClassB();
		Double hra = classB.calcHRA(classA.basicPay);
		Double pf = classB.calcPF(classA.basicPay);
		
		System.out.println("------------------Salary Slip----------------------");
		System.out.println("Basic Pay "+classA.basicPay);
		System.out.println("HRA "+hra);

	}
}
