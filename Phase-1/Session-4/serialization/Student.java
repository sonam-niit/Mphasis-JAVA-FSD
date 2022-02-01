package com.simplilearn.serialization;

import java.io.Serializable;

//pain java class
public class Student implements Serializable {

	private int id;
	private String name;
	private transient String email;//don't serialize this value
	private String password;
	
	public Student(int id,String name, String email, String password)
	{
		this.id=id;
		this.name=name;
		this.email=email;
		this.password=password;
	}
	
	public void display()
	{
		System.out.println(id+" "+name+" "+email+" "+password);
	}
	
	public static void main(String[] args) {
		
		Student s1= new Student(1, "test", "test@123.com", "test@123");
		s1.display();
	}
}
