package com.simplilearn.collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		
		set.add("apple");
		set.add("banana");
		set.add(null);
		set.add("banana");
		set.add("cherry");
		set.add("almond");
		
		System.out.println("Size: "+set.size());
		System.out.println(set);
		
		System.out.println("Contains "+set.contains("cherry"));
		
		set.remove(null);
		
		System.out.println(set);
		
		//iterate using iterator 
		//iterate using for each Loop
		
	}
}
