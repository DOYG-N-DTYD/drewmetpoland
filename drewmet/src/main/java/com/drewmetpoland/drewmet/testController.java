package com.drewmetpoland.drewmet;

import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;


@RestController
public class testController {

	@RequestMapping("/")
	public ModelAndView home(Model model) {
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("testPage");
		model.addAttribute("title", "DrewMet !!!!!!!!!!!");
	    return modelAndView;
//		return "testPage";
	}
}
