package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.form.RegistRestaurantForm;

@Controller
public class MaintenanceController {

	@GetMapping("/mt-top")
	public String showMtTop() {
		return "mt-top";
	}

	@GetMapping("/regist-restaurant")
	public String registRestaurant(@ModelAttribute RegistRestaurantForm restaurantForm) {
		return "/regist-restaurant";
	}
}
