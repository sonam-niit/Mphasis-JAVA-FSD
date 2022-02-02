package com.simplilearn.filehandling;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReadFile {

	public static void readFileFileReaderClass() throws IOException
	{
		
		FileReader reader= new FileReader("D:\\files\\testFile1.txt");
		int data;
		while((data=reader.read())!=-1)
		{
			System.out.print((char)data);
		}
	}
	public static void readFileFileInputStream() throws IOException
	{
		
		FileInputStream stream= new FileInputStream("D:\\files\\testFile2.txt");
		int data;
		while((data=stream.read())!=-1)
		{
			System.out.print((char)data);
		}
	}
	public static void readDataUsingNIO() throws IOException
	{
		List<String> list= Collections.emptyList();
		Path path= Paths.get("D:\\files\\testFile4.txt");
		list= Files.readAllLines(path,StandardCharsets.UTF_8);
		
		Iterator<String> it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	public static void main(String[] args) {
		try {
			//readFileFileReaderClass();
			//readFileFileInputStream();
			readDataUsingNIO();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
