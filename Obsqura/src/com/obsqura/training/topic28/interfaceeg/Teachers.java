package com.obsqura.training.topic28.interfaceeg;


public class Teachers implements CollegeInterface {

	@Override
	
	public void countOf(int n) {
		System.out.println("Number of teachers" + n);
		if (n < 50) {
			System.out.println("Inform recruitment team");
		} else {
			System.out.println("Strength is okay for teachers");
		}
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Printing teachers details");
		
	}

}
