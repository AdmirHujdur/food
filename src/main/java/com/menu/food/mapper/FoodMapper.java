package com.menu.food.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.menu.food.model.Food;

@Mapper
public interface FoodMapper {
	
	@Select("SELECT * FROM FOOD")
	Food[] selectFoods();
	
	@Insert("INSERT INTO FOOD (name, price, origin) VALUES(#{name},#{price},#{origin})")
	int insertFood(Food food);
}
