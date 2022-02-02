package com.simplilearn.exceptionhandling;

public class Handling3 {

	static void divide(int a,int b)
	{
		//throwing unchecked exception
		int c=a/b;
		System.out.println("Result "+c);
	}
	
	public static void main(String[] args) {
		try {
			divide(2,0);
		}
		catch(Exception e)
		{
			System.out.println("Error "+e);
			e.printStackTrace();
		}
	}
}
