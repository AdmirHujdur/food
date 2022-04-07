package com.menu.food.service;

import org.springframework.stereotype.Service;

import com.menu.food.mapper.FoodMapper;
import com.menu.food.model.Food;

@Service
public class FoodService {
	
	private FoodMapper foodMapper;
	
	public FoodService(FoodMapper foodMapper) {
		this.foodMapper=foodMapper;
	}

	public Food[] getFoods() {
		Food[] foods = foodMapper.selectFoods();
		return foods;
	}
	
	public int addFood(Food food) {
		return foodMapper.insertFood(food);
	}
}
