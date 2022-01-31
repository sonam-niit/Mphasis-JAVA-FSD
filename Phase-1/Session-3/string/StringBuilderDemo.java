package com.simplilearn.string;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		String str= new String("Hello World");
		//convert string to stringBuilder
		StringBuilder s1=new StringBuilder(str);
		
		System.out.println("size "+s1.length());
		
		s1.append("Welcome");
		System.out.println(s1);
		
		s1.insert(11, " ");
		System.out.println(s1);
		
		s1.replace(12, 19, "Bye");
		System.out.println(s1);
		
		s1.reverse();
		System.out.println(s1);
	}
}
