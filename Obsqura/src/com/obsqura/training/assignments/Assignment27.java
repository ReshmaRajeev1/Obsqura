package com.obsqura.training.assignments;

import java.util.Scanner;

public class Assignment27 {

	int totPrice=0;

	public int price(String item) {
		if (item.equalsIgnoreCase("rice")) {
			return 40;
		} else if (item.equalsIgnoreCase("grains")) {
			return 70;
		} else if (item.equalsIgnoreCase("peanuts")) {
			return 89;
		} else {
			return 0;
		}
	}

	public void calcTotalPrice(String item) {
		int priceOfItem = price(item);
		totPrice = totPrice + priceOfItem;;
	}

	public void discount() {
		if (totPrice > 50000) {
			System.out.println("discount " + (totPrice - 100));
		} else {
			System.out.println("No discount " + totPrice);
		}

	}

	public static void main(String[] args) {
		Assignment27 obj = new Assignment27();
		String item;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your count");
		int count = sc.nextInt();
		int priceOfItem = obj.price("rice");
		for(int i=1;i<=count;i++) {
			System.out.println("Enter your item");
			Scanner scItem = new Scanner(System.in);
			item = scItem.nextLine();
			obj.calcTotalPrice(item);
		}
		
		obj.discount();

	}
}
