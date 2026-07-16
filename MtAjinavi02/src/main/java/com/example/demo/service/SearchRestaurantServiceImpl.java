package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.RestaurantDto;
import com.example.demo.form.SearchRestaurantForm;
import com.example.demo.repository.SearchRestaurantRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SearchRestaurantServiceImpl implements SearchRestaurantService{
	
	private final SearchRestaurantRepository repository;
	
	@Override
	public List<RestaurantDto> searchRestaurantList(SearchRestaurantForm form){
		List<RestaurantDto> list = repository.search(form);
		return list;
	}
}
