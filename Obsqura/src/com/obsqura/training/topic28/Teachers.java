package com.obsqura.training.topic28;

public class Teachers extends College {

	@Override
	void countOf(int n) {
		
		System.out.println("Number of teachers" + n);
		if (n < 50) {
			System.out.println("Inform recruitment team");
		} else {
			System.out.println("Strength is okay for teachers");
		}
	}

}
