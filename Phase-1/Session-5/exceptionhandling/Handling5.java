package com.simplilearn.exceptionhandling;

//throw exception by own
//we can use throw keyword
public class Handling5 {

	//throwing checked Exception
	static void check(int age) throws Exception
	{
		if(age<18)
			throw new Exception("Not valid age exception");
		else
			System.out.println("Valid User");
	}
	
	static void test() throws Exception
	{
		check(14);
	}
	
	public static void main(String[] args) {
		
		try {
			test();
		} catch (Exception e) {
			e.printStackTrace();
		} //handle using try catch
	}
}
