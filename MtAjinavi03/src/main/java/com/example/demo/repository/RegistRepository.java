package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.RegistRestaurant;

@Repository
public interface RegistRepository {
	public void add(RegistRestaurant restaurantDto);
}
