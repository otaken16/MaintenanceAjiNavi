package com.example.demo.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import lombok.Data;

@Data
public class RegistRestaurantForm {
	@NotBlank(message = "入力がありません")
	@Size(min = 0, max = 30, message ="30文字以内で入力してください。")
	private String restaurantName;
	
	
	@NotBlank(message = "入力がありません")
	@Size(max = 100, message = "100文字以内で入力してください。")
	private String catchPhrase;
}

