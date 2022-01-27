package com.simplilearn.typecasting;

//Narrowing Typecasting
public class ExplicitTypeCasting {

	public static void main(String[] args) {
		
		double a=23.67;
		
		int b=(int) a;//convert forcefully to int
		
		System.out.println("Converted double "+a+ " to int "+b);
	}
}
