package com.drewmetpoland.drewmet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping("/")
	public ModelAndView home(Model model) {
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("index_en");
		model.addAttribute("title", "DrewMet !!!!!!!!!!!");
	    return modelAndView;
	}
	
	@RequestMapping("/page_about")
	public ModelAndView page_about(Model model) {
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("page_about");
	    return modelAndView;
	}
    @RequestMapping("/page_products")
	public ModelAndView page_products(Model model) {
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("page_products");
	    return modelAndView;
	}
    @RequestMapping("/page_contact")
	public ModelAndView page_contact(Model model) {
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("page_contact");
	    return modelAndView;
	}
    @RequestMapping("/page_orderBuy")
	public ModelAndView page_orderBuy(Model model) {
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("page_orderBuy");
	    return modelAndView;
	}
    @RequestMapping("/page1")
	public ModelAndView page1(Model model) {
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("page1");
	    return modelAndView;
	}
    @RequestMapping("/page2")
	public ModelAndView page2(Model model) {
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("page2");
	    return modelAndView;
	}
    @RequestMapping("/page3")
	public ModelAndView page3(Model model) {
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("page3");
	    return modelAndView;
	}
    @RequestMapping("/page4")
	public ModelAndView page4(Model model) {
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("page4");
	    return modelAndView;
	}
    @RequestMapping("/page5")
	public ModelAndView page5(Model model) {
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("page5");
	    return modelAndView;
	}
    @RequestMapping("/test")
	public ModelAndView test(Model model) {
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("test");
	    return modelAndView;
	}
}