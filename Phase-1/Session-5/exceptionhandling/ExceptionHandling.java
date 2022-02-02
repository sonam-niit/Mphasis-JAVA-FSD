package com.simplilearn.exceptionhandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=0;i<args.length;i++)
		{
			try 
			{
				//risky code//code which is going to throw error
				sum= sum + Integer.parseInt(args[i]);
			}
			//handling code
			catch(Exception e)
			{
				System.out.println("Exception Occured "+e);
			}
		}
		System.out.println("Sum is "+sum);
	}
}
