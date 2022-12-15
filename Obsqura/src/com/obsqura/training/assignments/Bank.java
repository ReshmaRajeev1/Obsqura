package com.obsqura.training.assignments;

import java.util.Scanner;

public class Bank {
	static int saving;

	static void deposit(int amount) {
		saving = saving + amount;
		System.out.println("Amount is deposited " + saving);
	}

	static void withdraw(int withdrawAmount) {
		boolean flag = balnceCheck(withdrawAmount);
		if (flag) {
			saving = saving - withdrawAmount;
			System.out.println("Amount is withdrawn " + withdrawAmount);
			System.out.println("Total balance " + saving);
		} else {
			System.out.println("Amount cannot be withdrawn " + withdrawAmount);
	

		}

	}

	static boolean balnceCheck(int withdrawAmount) {
		if (withdrawAmount > saving) {
			return false;
		} else
			return true;

	}

	public static void main(String[] args) {
		System.out.println("ENter your amount");
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		deposit(amount);
		withdraw(1500);
	}
}
