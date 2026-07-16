package com.example.demo.entity;

import lombok.Data;

@Data
public class RestaurantDto {
	private int restaurantId;
	private String restaurantName;
	private String catchPhrase;
	private int reviewCount;
}
