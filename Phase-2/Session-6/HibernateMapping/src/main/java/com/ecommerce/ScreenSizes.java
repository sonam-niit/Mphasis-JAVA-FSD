package com.ecommerce;

public class ScreenSizes {
	private long SCREENID;
	private String size;
	
	public ScreenSizes() {
	}

	public ScreenSizes(String size) {
		this.SCREENID = 0;
		this.size = size;
	}

	public long getSCREENID() {
		return SCREENID;
	}

	public void setSCREENID(long sCREENID) {
		SCREENID = sCREENID;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	
}
