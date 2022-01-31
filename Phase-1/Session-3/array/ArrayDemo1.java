package com.simplilearn.array;

import java.util.Scanner;

//declare array with size without elements
public class ArrayDemo1 {

	public static void main(String[] args) {
		
		int array[]=new int[10];
		
		System.out.println("Store elements in this array dynamically");
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println("Enter any number");
			array[i]=sc.nextInt();
		}
		
		System.out.println("Let's print elements of array");
		for(int a:array)
		{
			System.out.println(a);
		}
		
		//find out the largest and smallest number from array
	}
}
