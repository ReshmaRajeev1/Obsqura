package com.obsqura.training.topic10;

public class SwitchExample {
	public static void main(String[] args) {
		int weekNumber = 10 ;
		String weekName = null;
		switch (weekNumber) {
		case 1:
			weekName = "Sunday";
			System.out.println(weekName);
			break;
		case 2:
			weekName = "Monday";
			System.out.println(weekName);
			break;
		case 3:
			weekName = "Tuesday";
			System.out.println(weekName);
			break;
		case 4:
			weekName = "Wednesday";
			System.out.println(weekName);
			break;
		case 5:
			weekName = "Thursday";
			System.out.println(weekName);
			break;
		case 6:
			weekName = "Friday";
			System.out.println(weekName);
			break;
		case 7:
			weekName = "Satuday";
			System.out.println(weekName);
		default :
			System.out.println("default block");

		}
		
	}

}
