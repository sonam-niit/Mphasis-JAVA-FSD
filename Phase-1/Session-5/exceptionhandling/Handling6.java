package com.simplilearn.exceptionhandling;

//throw exception by own
//we can use throw keyword
public class Handling6 {

	//throwing unchecked Exception
	static void check(int age)
	{
		if(age<18)
			throw new ArithmeticException("Not valid age exception");
		else
			System.out.println("Valid User");
	}
	
	public static void main(String[] args) {
		
		check(6); //handle this using try catch
	}
}
