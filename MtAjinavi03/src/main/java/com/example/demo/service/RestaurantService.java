package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.RestaurantDto;
import com.example.demo.form.EditRestaurantForm;
import com.example.demo.form.SearchRestaurantForm;

public interface RestaurantService {
	
	// 【検索】レストラン検索メソッド
	public List<RestaurantDto> searchRestaurantList(SearchRestaurantForm form);
	
	// 【更新】レストラン更新メソッド
	public void editRestaurant(EditRestaurantForm form);
}
