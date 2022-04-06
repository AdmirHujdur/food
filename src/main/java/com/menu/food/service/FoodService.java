package com.menu.food.service;

import org.springframework.stereotype.Service;

import com.menu.food.model.Food;

@Service
public class FoodService {

	public Food[] getFoods() {
		Food[] foods = {new Food("Pizza", 8.00,"Italien"), new Food("Burger", 5.60, "Amerika"), new Food("Reis", 1.20, "Japan")};
		return foods;
	}
}
