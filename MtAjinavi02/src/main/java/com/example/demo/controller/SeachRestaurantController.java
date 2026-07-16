package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.RestaurantDto;
import com.example.demo.form.SearchRestaurantForm;
import com.example.demo.service.SearchRestaurantService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class SeachRestaurantController {
	
	private final SearchRestaurantService service;
	
	@GetMapping("/search-restaurant")
	public String searchRestaurant(@ModelAttribute SearchRestaurantForm form) {
		return "search-restaurant";
	}

	@PostMapping("/search-restaurant-list")
	public String searchRestaurantList(@ModelAttribute SearchRestaurantForm form, Model model) {

		List<RestaurantDto> list = new ArrayList<>();
		
		list = service.searchRestaurantList(form);
		
		model.addAttribute("restaurantList",list);

		return "search-restaurant";
	}
}
