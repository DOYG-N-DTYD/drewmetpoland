package com.website.drewmetpoland.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LanguagesController {
    @GetMapping("/page_orderBuy")
	public String orderBuy(Model model) {
		model.addAttribute("title", "OrderBuy");
		return "PAGE_ORDER_BUY_LANGUAGE";
	}
}
