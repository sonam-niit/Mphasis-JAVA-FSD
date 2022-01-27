package com.simplilearn.basic;

public class Loops {

	public static void main(String[] args) {
		
		int i=0;
		while(i<=5)
		{
			System.out.println("Using While "+i);
			i++;
		}
		
		do
		{
			System.out.println("Using Do while "+i);
			i++;
		}while(i<=10);
		
		for(i=1;i<=5;i++)
		{
			System.out.println("Using for "+i);
		}
		System.out.println(i);
	}
}
