package com.simplilearn.inheritance;

public class Bicycle {

	private int gear;
	private int speed;
	
	public Bicycle(int gear,int speed) {
		this.gear=gear;
		this.speed=speed;
	}
	public void applyBreak(int decrement) {
		speed -= decrement;
	}
	public void speedUp(int increment) {
		speed += increment;
	}
	@Override
	public String toString() {
		return "Bicycle [No of Gears=" + gear + ", Speed of Bicycle=" + speed + "]";
	}
	
}
