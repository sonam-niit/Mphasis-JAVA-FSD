package com.simplilearn.array;

import java.util.Scanner;

public class MultiDimeArray2 {

	public static void main(String[] args) {
		
		int array[][]= new int[3][3];
		
		System.out.println("Store element in matrix");
		Scanner sc=new Scanner(System.in);
		for(int row=0;row<3;row++)
		{
			for(int col=0;col<3;col++)
			{	
				System.out.println("Enter Any number");
				array[row][col]= sc.nextInt();
			}
		}
		
		System.out.println("Print matrix");
		for(int row=0;row<3;row++)
		{
			for(int col=0;col<3;col++)
			{
				System.out.print(array[row][col]+"\t");
			}
			System.out.println();
		}
	}
}
