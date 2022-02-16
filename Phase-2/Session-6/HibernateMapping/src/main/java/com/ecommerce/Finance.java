package com.ecommerce;

public class Finance {

	private long FINANCEID;
	private String name;
	private String ftype;
	public Finance() {}
	public Finance(String name, String ftype) {
		FINANCEID = 0;
		this.name = name;
		this.ftype = ftype;
	}
	public long getFINANCEID() {
		return FINANCEID;
	}
	public void setFINANCEID(long fINANCEID) {
		FINANCEID = fINANCEID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFtype() {
		return ftype;
	}
	public void setFtype(String ftype) {
		this.ftype = ftype;
	}
	
	
}
