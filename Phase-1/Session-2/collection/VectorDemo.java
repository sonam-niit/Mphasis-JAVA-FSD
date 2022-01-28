package com.simplilearn.collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> list = new Vector<String>();
		
		System.out.println("Size "+list.size());
		list.add("apple");
		list.add("banana");
		list.add("cherry");
		list.add("apple");
		list.add(null);
		
		System.out.println("After adding elements "+list.size());
		System.out.println(list);
		System.out.println("elemnt at Index 4: "+list.get(4));
		list.add(4, "pizza");
		System.out.println(list);
		System.out.println("List contains apple? "+list.contains("apple"));
		
		list.remove(0);
		list.remove(null);
		System.out.println(list);
		
		//foreach loop
		for(String s:list)
		{
			System.out.println(s);
		}
		
		//iterate using iterator	
		Iterator<String> itr=list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
}
