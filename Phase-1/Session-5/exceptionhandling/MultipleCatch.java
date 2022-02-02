package com.simplilearn.exceptionhandling;

public class MultipleCatch {

	public static void main(String[] args) {
		
		try
		{
			int result= 10/8;
			System.out.println("Result "+result);
			
			int a[]= {1,2,3,4,5};
			System.out.println("Value at index 5 "+ a[3]);
			
			String name=null;
			name.equals("user");
			
			Thread.sleep(100);
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception "+ e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Issue: "+e.getMessage());
		}
		catch(NullPointerException e)
		{
			System.out.println("Object is null "+ e.getMessage());
		}
		catch(InterruptedException e)
		{
			System.out.println("Error working with thread "+e);
		}
		//should keep last
		catch(Exception e)
		{
			System.out.println("Error Occured "+ e.getMessage());
		}
	}
}
