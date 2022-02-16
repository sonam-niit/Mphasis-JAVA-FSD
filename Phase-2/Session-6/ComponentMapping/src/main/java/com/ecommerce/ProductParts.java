package com.ecommerce;

public class ProductParts {

	private String hdd;
	private String cpu;
	private String ram;
	public ProductParts() {
		
	}
	public ProductParts(String hdd, String cpu, String ram) {
		super();
		this.hdd = hdd;
		this.cpu = cpu;
		this.ram = ram;
	}

	public String getHdd() {
		return hdd;
	}
	public void setHdd(String hdd) {
		this.hdd = hdd;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	
	
}
