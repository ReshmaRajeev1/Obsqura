package com.obsqura.training.assignments;

public class FibonacciWithRecursion {
	static int n1, n2, n3;

	public static void fibnoci(int count) {

		if (count > 0) {
			n3 = n1 + n2;
			System.out.println(n3);
			fibnoci(count - 1);
		}

	}
	public static void main(String[] args) {
		n1 = 0;
		n2 = 1;
		fibnoci(10);
		System.out.print(n1 + " " + n2);
	}

}
