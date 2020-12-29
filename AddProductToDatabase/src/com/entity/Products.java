package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Products {
	@Id
	private String productId;
	private String productName;
	private int price;
	public Products(String id, String name, int price) {
		super();
		this.productId = id;
		this.productName = name;
		this.price = price;
	}
	public String getId() {
		return productId;
	}
	public void setId(String id) {
		this.productId = id;
	}
	public String getName() {
		return productName;
	}
	public void setName(String name) {
		this.productName = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + productId + ", name=" + productName + ", price=" + price + "]";
	}
	
	
}
