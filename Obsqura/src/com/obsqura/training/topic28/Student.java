package com.obsqura.training.topic28;

import java.util.Scanner;

public class Student extends College{
	@Override
	void countOf(int n) {
		
		// TODO Auto-generated method stub
		System.out.println("Number of students"+n);
		if(n<50) {
			System.out.println("Inform management team");
		}else {
			System.out.println("Strength is okay");
		}
		
	}
	
	

}
