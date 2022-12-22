package com.obsqura.training.topic28.interfaceeg;

public class Student implements CollegeInterface,AttendanceInterface{
	@Override
	
	public void countOf(int n) {
		// TODO Auto-generated method stub
		System.out.println("Number of students"+n);
		if(n<50) {
			System.out.println("Inform management team");
		}else {
			System.out.println("Strength is okay");
		}
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Printing students details");
		
	}

	@Override
	public void displayAttendencePercet() {
		// TODO Auto-generated method stub
		System.out.println("Full percentage");
		
	}
	
	

}
