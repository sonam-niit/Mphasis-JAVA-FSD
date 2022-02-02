package com.simplilearn.customexception;

public class UseHandler {

	static void check(int age) throws AgeNotValidException
	{
		if(age<18)
			throw new AgeNotValidException("User can not vote before 18");
		else
			System.out.println("can Vote");
	}
	
	public static void main(String[] args) {
		
		try {
			check(16);
			
		} catch (AgeNotValidException e) {
			
			System.out.println(e);
		}
	}
}
