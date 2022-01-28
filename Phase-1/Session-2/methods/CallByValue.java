package com.simplilearn.methods;

public class CallByValue {

	//class level variable, access using this keyword
	int num=150;
	
	void operation(int num)
	{
		this.num=num*10/100;
	}
	
	public static void main(String[] args) {
		CallByValue c=new CallByValue();
		System.out.println("Value of num Before function call "+c.num);
		
		c.operation(100);
		System.out.println("Value of num After function call "+c.num);
	}
}
