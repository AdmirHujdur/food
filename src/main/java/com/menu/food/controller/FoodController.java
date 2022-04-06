package com.menu.food.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.menu.food.model.Food;
import com.menu.food.service.FoodService;

import org.springframework.ui.Model;

@Controller
public class FoodController {
	
	private FoodService foodService;
	
	public FoodController(FoodService foodService) {
		
		this.foodService = foodService;
	}

	@GetMapping("/")
	public String getHome(Model model) {
		model.addAttribute("message","Juten Tach!");
		
		Food[] foods = foodService.getFoods();
		model.addAttribute("foods",foods);

		
		return "home";
	}
	
	@GetMapping("/home")
	public String getNome(Model model) {
		model.addAttribute("message","Juten Tach!");
		
		Food[] foods = {new Food("Cevapcici", 8.00,"Bosnien"), new Food("Burger", 5.60, "Amerika"), new Food("Reis", 1.20, "Japan")};
		model.addAttribute("foods",foods);

		
		return "home";
	}
}
