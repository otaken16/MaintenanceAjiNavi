package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.RegistRestaurant;
import com.example.demo.repository.RegistRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RegistServiceImpl implements RegistService{
	
	private final RegistRepository registRepository;
	
	@Override
	public void regist(RegistRestaurant restaurantDto) {
		registRepository.add(restaurantDto);
		
	}
}
