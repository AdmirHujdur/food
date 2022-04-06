package com.menu.food.model;

public class Food {

	private String foodName;
	private Double price;
	private String origin;
	
	public Food(String foodName, Double price, String origin) {
		super();
		this.foodName = foodName;
		this.price = price;
		this.origin = origin;
	}
	
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
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
