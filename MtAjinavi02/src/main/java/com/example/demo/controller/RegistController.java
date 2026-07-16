package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.entity.RegistRestaurant;
import com.example.demo.form.RegistRestaurantForm;
import com.example.demo.service.RegistService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class RegistController {

	private final RegistService registService;

	/**
	 * 🌟登録確認処理
	 * **/
	@PostMapping("/regist-confirm")
	public String registConfirm(@Validated @ModelAttribute RegistRestaurantForm form, BindingResult result) {
		if (result.hasErrors())
			return "regist-restaurant";
		return "regist-confirm";
	}

	/**
	 * 🌟登録確認画面から戻る
	 * **/
	@PostMapping("/regist-let")
	public String registLet(@ModelAttribute RegistRestaurantForm form) {
		return "regist-restaurant";
	}

	/**
	 * 🌟登録完了処理
	 * **/
	@PostMapping("/regist-complete")
	public String registComplete(@ModelAttribute RegistRestaurantForm form,
			RedirectAttributes redirectAttributes) {

		RegistRestaurant restaurantDto = new RegistRestaurant();
		restaurantDto.setRestaurantName(form.getRestaurantName());
		restaurantDto.setCatchPhrase(form.getCatchPhrase());

		registService.regist(restaurantDto);

		redirectAttributes.addFlashAttribute(
				"msg",
				"登録完了");

		return "redirect:/complete";
	}

	/**
	 * 🌟PRGパターン（Post Redirect Get）
	 * 登録完了処理でHTMLを返却するのではなく、GET(/complete)をするようにするハンドラ
	 * **/
	@GetMapping("/complete")
	public String complete() {
		return "complete";
	}

}