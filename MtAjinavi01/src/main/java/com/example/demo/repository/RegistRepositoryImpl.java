package com.example.demo.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.RegistRestaurant;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class RegistRepositoryImpl implements RegistRepository {
	private final JdbcTemplate jdbcTemplate;

	@Override
	public void add(RegistRestaurant restaurantDto) {
		String sql = "INSERT INTO m_restaurant" +
				"(restaurant_name, catch_phrase)" +
				"VALUES (?,?)";

		jdbcTemplate.update(sql, restaurantDto.getRestaurantName(), restaurantDto.getCatchPhrase());
	}

}
