package com.simplilearn.inner;

public class LocalInnerClass {

	void check(int age)
	{
		if(age>=18)
		{
			class Inner{
				
				void validate()
				{
					System.out.println("Validated");
				}
			}
			
			Inner inner=new Inner();
			inner.validate();
		}
		else
		{
			System.out.println("Not valid");
		}
	}
	
	public static void main(String[] args) {
		LocalInnerClass outer=new LocalInnerClass();
		outer.check(19);
	}
}
