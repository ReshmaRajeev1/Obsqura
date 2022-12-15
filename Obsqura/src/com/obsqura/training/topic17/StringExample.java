package com.obsqura.training.topic17;

public class StringExample {
	public static void main(String[] args) {
		// creating string using by literal
		String s1 = "Cat";
		String s2 = "Cat";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2));// content is checked
		System.out.println(s1 == s2);// here references are checked
		System.out.println(s1.length());
		if (s1.contains("Ca")) {
			System.out.println("Ca is present in Cat");
		}
		
		String s3 = new String("Dog");
		String s4 = new String("Dog");
		System.out.println(s3.equals(s4));// content is checked
		System.out.println(s3 == s4);// here references are checked

		String s5 = "Malayalam";
		String s6 = "malayalam";
		if (s5.equals(s6)) {
			System.out.println("Not equal may be it is case sensitive");
		} else if (s5.equalsIgnoreCase(s6)) {
			System.out.println("Equal it is not case sensitive");
		}
	}

}
