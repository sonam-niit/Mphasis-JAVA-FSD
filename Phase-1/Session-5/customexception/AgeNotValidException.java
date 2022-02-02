package com.simplilearn.customexception;

public class AgeNotValidException extends Exception{

	private String msg;
	
	public AgeNotValidException(String msg) {
		
		this.msg=msg;
	}

	@Override
	public String toString() {
		return "AgeNotValidException [message=" + msg + "]";
	}
	
	
}
