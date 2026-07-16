package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.RestaurantDto;
import com.example.demo.form.EditRestaurantForm;
import com.example.demo.form.RemoveRestaurantForm;
import com.example.demo.form.SearchRestaurantForm;
import com.example.demo.repository.RestaurantRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RestaurantServiceImpl implements RestaurantService {

	private final RestaurantRepository repository;

	@Override
	public List<RestaurantDto> searchRestaurantList(SearchRestaurantForm form) {
		List<RestaurantDto> list = repository.selectByRestaurantList(form);
		return list;
	}

	@Override
	public void editRestaurant(EditRestaurantForm form) {
		repository.updateRestaurant(form);
	}

	@Override
	public void removeRestaurant(RemoveRestaurantForm form) {
		repository.deleteRestaurant(form);
	}

}
