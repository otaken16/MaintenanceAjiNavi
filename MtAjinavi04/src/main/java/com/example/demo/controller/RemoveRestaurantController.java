package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.form.RemoveRestaurantForm;
import com.example.demo.service.RestaurantService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class RemoveRestaurantController {

	private final RestaurantService service;

	/**
	 * 🌟削除確認処理
	 * **/
	@PostMapping("/remove-restaurant")
	public String removeConfirm(@Validated @ModelAttribute RemoveRestaurantForm form, BindingResult result) {
		if (result.hasErrors())
			return "search-restaurant";
		return "remove-confirm";
	}

	/**
	 * 🌟削除確認から戻る処理
	 * **/
	@PostMapping("/remove-let")
	public String removeLet(@Validated @ModelAttribute RemoveRestaurantForm form, BindingResult result) {
		if (result.hasErrors())
			return "search-restaurant";
		return "search-restaurant";
	}

	/**
	 * 🌟削除完了
	 * **/
	@PostMapping("/remove-complete")
	public String removeComplete(@ModelAttribute RemoveRestaurantForm form,
			RedirectAttributes redirectAttributes) {
		service.removeRestaurant(form);
		redirectAttributes.addFlashAttribute(
				"msg",
				"削除完了");
		return "redirect:/complete";
	}
}
