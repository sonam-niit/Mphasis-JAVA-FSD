package com.simplilearn.filehandling;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFile {

	public static void main(String[] args) {
		
		try {
			Path path= Paths.get("D:\\files\\testFile1.txt");
			if(Files.deleteIfExists(path))
				System.out.println("File deleted");
			else
				System.out.println("file not deleted");
			
		} catch (NoSuchFileException e) {
			System.out.println("No such file exist");
		}
		catch(DirectoryNotEmptyException e)
		{
			System.out.println("Directory is not empty");
		}
		catch(IOException e)
		{
			System.out.println("Invalid Permission");
		}
	}
}
