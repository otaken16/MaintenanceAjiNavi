package com.example.demo.repository;

import java.util.List;

import com.example.demo.entity.RestaurantDto;
import com.example.demo.form.EditRestaurantForm;
import com.example.demo.form.SearchRestaurantForm;

public interface RestaurantRepository {
	public List<RestaurantDto> selectByRestaurantList(SearchRestaurantForm form);
	
	public void updateRestaurant(EditRestaurantForm form);
}
