package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.form.EditRestaurantForm;
import com.example.demo.service.RestaurantService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class EditRestaurantController {

	private final RestaurantService service;

	@PostMapping("/edit-restaurant")
	public String editRestaurant(@ModelAttribute EditRestaurantForm form, Model model) {
		return "edit-restaurant";
	}

	/**
	 * 🌟編集確認処理
	 * **/
	@PostMapping("/edit-confirm")
	public String editConfirm(@Validated @ModelAttribute EditRestaurantForm form, BindingResult result) {
		if (result.hasErrors())
			return "edit-restaurant";
		return "edit-confirm";
	}

	/**
	 * 🌟編集確認から戻る処理
	 * **/
	@PostMapping("/edit-let")
	public String editLet(@Validated @ModelAttribute EditRestaurantForm form, BindingResult result) {
		if (result.hasErrors())
			return "edit-restaurant";
		return "edit-restaurant";
	}

	@PostMapping("/edit-complete")
	public String editComplete(@ModelAttribute EditRestaurantForm form,
			RedirectAttributes redirectAttributes) {
		service.editRestaurant(form);
		redirectAttributes.addFlashAttribute(
				"msg",
				"登録完了");
		return "redirect:/complete";
	}
}
