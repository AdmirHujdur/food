package com.menu.food.model;

public class Food {

	private String name;
	private Double price;
	private String origin;
	private Integer count=0;
	
		
	public Food(String name, Double price, String origin) {		
		count ++;
		this.name = name;
		this.price = price;
		this.origin = origin;
		this.count = count;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public Integer getCount() {
		return count;
	}
	
	
	
	
}
