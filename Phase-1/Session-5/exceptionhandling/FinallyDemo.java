package com.simplilearn.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any value");
		try {
			int num=sc.nextInt();
			System.out.println("Value "+num);
			
		}
		catch(InputMismatchException e)
		{
			System.out.println("Wrong Input "+e);
		}
		finally
		{
			sc.close();
			System.out.println("Scaner closed successfully");
		}
	}
}
