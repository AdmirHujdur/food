package com.menu.food.model;

public class Food {
	
	private Integer id;
	private String name;
	private Double price;
	private String origin;
	
	
		
	public Food(Integer id, String name, Double price, String origin) {				
		this.id = id;
		this.name = name;
		this.price = price;
		this.origin = origin;				
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
	
	
}
