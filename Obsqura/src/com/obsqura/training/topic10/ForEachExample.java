package com.obsqura.training.topic10;

public class ForEachExample {
	public static void main(String[] args) {
		int[] numbers = {4,5,6,7,8,9,8,3,2,5};
		for(int number :numbers) {
			System.out.println(number);
		}
		
		String[] names = {"smith","vivek","carl","james"};
		for(String name:names) {
			System.out.println(name);
		}
	}

}
