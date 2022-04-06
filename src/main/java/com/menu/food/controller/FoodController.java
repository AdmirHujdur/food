package com.menu.food.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class FoodController {

	@GetMapping("/home")
	public String getHome(Model model) {
		model.addAttribute("message","Hallo Leute ich bin vom FoodController");
		return "home";
	}
}
