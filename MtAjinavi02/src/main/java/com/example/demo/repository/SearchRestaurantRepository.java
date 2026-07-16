package com.example.demo.repository;

import java.util.List;

import com.example.demo.entity.RestaurantDto;
import com.example.demo.form.SearchRestaurantForm;

public interface SearchRestaurantRepository {
	public List<RestaurantDto> search(SearchRestaurantForm form);
}
