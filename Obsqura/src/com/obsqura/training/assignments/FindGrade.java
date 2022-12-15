package com.obsqura.training.assignments;

import java.util.Scanner;

public class FindGrade {
	int grade=0;
	public FindGrade(int eng,int mat,int sc) {
		grade=eng+mat+sc;
		if(eng<=100 && mat<=100 && sc<=100) {
			System.out.println("\nMARKS \nEnglish: "+eng+"\nMaths: "+mat+"\nScience: "+sc);
			displayTotalMarks(grade);
		}else {
			System.out.println("Please enter a valid marks out of 100");
		}
	} 
	public int displayTotalMarks(int total) {
		if(total<120) {
			System.out.println("Total Score: "+total+" ,Failed ");
		}else if(total <=170) {
			System.out.println("Total Score: "+total+" ,Grade D ");
		}
		else if(total <=220) {
			System.out.println("Total Score: "+total+" ,Grade C ");
		}
		else if(total <=270) {
			System.out.println("Total Score: "+total+" ,Grade B ");
		}
		else if(total <=299) {
			System.out.println("Total Score: "+total+" ,Grade A ");
		}
		else if(total == 300) {
			System.out.println("Total Score: "+total+" ,Grade A+ ");
		}
		return total;
	}
	public static void main(String[] args) {
		for(int i=0;i<=1;i++) {
			if(i==0) {
				System.out.println("1st student mark out of 100 for ");
			}else {
				System.out.println("\n2nd student mark out of 100");
			}
			
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the Scored mark english");
			int storeScan1=scan.nextInt();
			System.out.println("Enter the Scored mark maths");
			int storeScan2=scan.nextInt();
			System.out.println("Enter the Scored mark science");
			int storeScan3=scan.nextInt();
			
			FindGrade obj1=new FindGrade(storeScan1,storeScan2,storeScan3);
			obj1.displayTotalMarks(obj1.grade);
		}
	}

}
