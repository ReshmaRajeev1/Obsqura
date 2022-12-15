package com.obsqura.training.assignments;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment42 {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Blue");
		colors.add("Green");
		colors.add("White");
		colors.add("Yellow");
		System.out.println("a---------------------------");
		System.out.println(colors);
		for(String color:colors) {
			System.out.println(color);
		}
		System.out.println("b---------------------------");
		System.out.println(colors.get(2));
		
		System.out.println("c---------------------------");
		Iterator iter = colors.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("d---------------------------");
		
		colors.remove(2);
		System.out.println(colors);
		System.out.println("e---------------------------");
		
		if(colors.contains("Blue")) {
			System.out.println("Element is existing");
		}else {
			System.out.println("Element is not existing");
		}
		
	}

}
