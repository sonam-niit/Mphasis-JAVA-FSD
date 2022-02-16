package com.ecommerce;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EProduct {

	private long ID;
	private String name;
	private BigDecimal price;
	private Date dateAdded;
	private ProductParts parts;
	
	public EProduct() {}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Date getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public ProductParts getParts() {
		return parts;
	}

	public void setParts(ProductParts parts) {
		this.parts = parts;
	}
	
}
