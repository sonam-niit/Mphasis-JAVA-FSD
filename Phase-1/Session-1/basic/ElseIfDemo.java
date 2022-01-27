package com.simplilearn.basic;

import java.util.Scanner;

public class ElseIfDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Percentage");
		
		int per= sc.nextInt();
		
		if(per>=70 && per<=100)
			System.out.println("Distinction");
		else if(per>=60 && per<70)
			System.out.println("First Class");
		else if(per>=50 && per<60)
			System.out.println("Second Class");
		else if(per>=35 && per<50)
			System.out.println("Pass Class");
		else if(per>=00 && per<35)
			System.out.println("Fail");
		else
			System.out.println("Enter correct Percentage");
	}
}
