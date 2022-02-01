package com.simplilearn.checkedexception;

import java.io.FileReader;

public class Demo2 {

	public static void main(String[] args) {
		//compile time: FileNotFoundException
		FileReader file= new FileReader("C://test//user.txt");
		
	}
}
