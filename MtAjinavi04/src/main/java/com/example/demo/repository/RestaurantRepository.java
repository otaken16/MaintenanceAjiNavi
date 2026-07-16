package com.example.demo.repository;

import java.util.List;

import com.example.demo.entity.RestaurantDto;
import com.example.demo.form.EditRestaurantForm;
import com.example.demo.form.RemoveRestaurantForm;
import com.example.demo.form.SearchRestaurantForm;

public interface RestaurantRepository {
	
	//	検索
	public List<RestaurantDto> selectByRestaurantList(SearchRestaurantForm form);
	
	// 更新
	public void updateRestaurant(EditRestaurantForm form);
	
	// 削除
	public void deleteRestaurant(RemoveRestaurantForm form);
}
