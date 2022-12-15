package com.obsqura.training.topic14;

public class TwoDimentionalArray {
	public static void main(String[] args) {
		int numbers[][] = { { 1, 3, 4 }, { 5, 4, 6 } };// declaration,instantiation,intialization
		int values[][] = new int[2][3];// declaration,instantiation
		values[0][0] = 1;
		values[0][1] = 3;
		values[0][2] = 4;
		values[1][0] = 5;
		values[1][1] = 4;
		values[1][2] = 6;

		// 1 3 4
		// 5 4 6
		System.out.println(values[0][0]);
		System.out.println(values[0][1]);
		System.out.println(values[0][2]);
		System.out.println(values[1][0]);
		System.out.println(values[1][1]);
		System.out.println(values[1][2]);
		
		System.out.println("Rows length: " + values.length);
		System.out.println("Columns length: "+values[0].length);
		System.out.println("Matrix iteration");
		for (int i = 0; i < values.length; i++) {
			for(int j=0;j<values[0].length;j++) {
				System.out.print(values[i][j]);
			}
			System.out.println();
		}

	}

}
