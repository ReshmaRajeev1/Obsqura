package com.obsqura.training.topic31;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import javax.sound.sampled.ReverbType;

public class HashSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet <Integer>();
		    set.add(2);
		    set.add(3);
		    set.add(1);
		    set.add(0);
		    
		    //Traversing elements using an iterator
		    Iterator itr=set.iterator();
		    while(itr.hasNext()){
		    System.out.println(itr.next());
		    }
		    /*
		    //Traversing elements using advanced for loop
		    for(String name:set){
		    System.out.println(name);
		    }
		    */
		    

	}

}
