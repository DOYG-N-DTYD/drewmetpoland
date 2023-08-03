package com.website.drewmetpoland.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("title", "DrewMet !!!!!!!!!!!");
		return "index_en";
	}
    @GetMapping("/page_products")
	public String products(Model model) {
		model.addAttribute("title", "Products");
		return "page_products";
	}
    @GetMapping("/page_about")
	public String about(Model model) {
		model.addAttribute("title", "About");
		return "page_about";
	}
    @GetMapping("/page_contact")
	public String contact(Model model) {
		model.addAttribute("title", "Contact");
		return "page_contact";
	}
    @GetMapping("/page_orderBuy")
	public String orderBuy(Model model) {
		model.addAttribute("title", "OrderBuy");
		return "page_orderBuy";
	}
    @GetMapping("/page1")
	public String page1(Model model) {
		model.addAttribute("title", "Page1");
		return "page1";
	}
    @GetMapping("/page2")
	public String page2(Model model) {
		model.addAttribute("title", "Page2");
		return "page2";
	}
    @GetMapping("/page3")
	public String page3(Model model) {
		model.addAttribute("title", "Page3");
		return "page3";
	}
    @GetMapping("/page4")
	public String page4(Model model) {
		model.addAttribute("title", "Page4");
		return "page4";
	}
    @GetMapping("/page5")
	public String page5(Model model) {
		model.addAttribute("title", "Page5");
		return "page5";
	}
}