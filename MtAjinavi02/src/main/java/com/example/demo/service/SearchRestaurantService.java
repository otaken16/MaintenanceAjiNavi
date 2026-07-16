package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.RestaurantDto;
import com.example.demo.form.SearchRestaurantForm;

public interface SearchRestaurantService {
	public List<RestaurantDto> searchRestaurantList(SearchRestaurantForm form);
}
