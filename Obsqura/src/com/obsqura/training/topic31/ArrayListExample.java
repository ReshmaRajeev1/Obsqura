package com.obsqura.training.topic31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {
	public static void main(String[] args) {
		// Non generics
		ArrayList list1 = new ArrayList();

		list1.add(1);
		list1.add("REshma");
		System.out.println(list1.get(1));
		String name = (String) list1.get(1);
		Integer value = (Integer) list1.get(0);
		Iterator iter1 = list1.iterator();
		while (iter1.hasNext()) {

			Object value1 = iter1.next();
		}
		// Generics
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(19);
		list.add(7);
		list.add(34);
			for(int i=0;i<list.size();i++) {
				if(list.get(i).equals(7)) {
					System.out.println("Value is present and index is "+i);
				}
			}
		Collections.sort(list, Collections.reverseOrder());
		Iterator iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		/*
		 * for(Integer a : list) { System.out.println(a); }
		 */
	}

}
