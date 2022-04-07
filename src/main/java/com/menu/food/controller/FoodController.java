package com.menu.food.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.menu.food.model.Food;
import com.menu.food.service.FoodService;

import org.springframework.ui.Model;

@Controller
public class FoodController {
	
	private FoodService foodService;
	
	public FoodController(FoodService foodService) {
		
		this.foodService = foodService;
	}

	@GetMapping("/home")
	public String getHome(Model model, Food food) {
		model.addAttribute("message","Juten Tach!");
		
		Food[] foods = foodService.getFoods();
		model.addAttribute("foods",foods);

		
		return "home";
	}
	
	@PostMapping("/home")
	public String addFood(Model model, Food food) {
		model.addAttribute("message","Juten Tach!");
		
		if(foodService.addFood(food)<1) {
			model.addAttribute("errorMessage", "Es ist ein Fehler aufgetreten!");
		}
		else {
			model.addAttribute("successMessage", String.format("Die Frucht %s wurde hinzugefügt", food.getName()));
			
			
		}
			
		Food[] foods = foodService.getFoods();
		model.addAttribute("foods",foods);
		
		

		return "home";
	}
	
	
	@GetMapping("/second")
	public String getNome(Model model) {
		model.addAttribute("message","Juten Tach!");
		
		Food[] foods = {new Food(0,"Cevapcici", 8.00,"Bosnien"), new Food(1,"Burger", 5.60, "Amerika"), new Food(2,"Reis", 1.20, "Japan")};
		model.addAttribute("foods",foods);

		
		return "home";
	}
}
