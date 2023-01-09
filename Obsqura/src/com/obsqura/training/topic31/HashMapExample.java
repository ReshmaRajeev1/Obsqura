package com.obsqura.training.topic31;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Sunday");
		map.put(2, "Monday");
		map.put(3, "Tuesday");
		map.put(4, "Wednesday");
		map.put(5, "Thursday");
		map.put(6, "Thursday");
		// First way of iterating a hashmap using keyset
		Iterator<Integer> iter = map.keySet().iterator();
		while (iter.hasNext()) {
			Integer key = iter.next();
			System.out.println("Key is " + key + " value is  " + map.get(key));

		}
		// Second way of iterating a hashmap using entryset
		Iterator entrySetIter = map.entrySet().iterator();

		while (entrySetIter.hasNext()) {
			Map.Entry entry = (Entry) entrySetIter.next();

			System.out.println(entry.getKey() + " ," + entry.getValue());
		}
	}

}
