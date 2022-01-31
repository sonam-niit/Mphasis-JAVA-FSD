package com.simplilearn.annonymousinner;

public class UseCar {

	public static void main(String[] args) {
		
		Car car1=new CarImpl();
		Car car2=new CarImpl();
		
		car1.start();
		car2.start();
		
		car1.stop();
		car2.stop();
	}
}
