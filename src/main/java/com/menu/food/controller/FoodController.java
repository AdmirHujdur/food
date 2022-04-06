package com.menu.food.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.menu.food.model.Food;

import org.springframework.ui.Model;

@Controller
public class FoodController {

	@GetMapping("/home")
	public String getHome(Model model) {
		model.addAttribute("message","Juten Tach!");
		
		Food[] foods = {new Food("Pizza", 8.00,"Italien"), new Food("Burger", 5.60, "Amerika"), new Food("Reis", 1.20, "Japan")};
		model.addAttribute("foods",foods);

		
		return "home";
	}
}
