package com.springboot.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String pp() {
		return "home";
	}
	@RequestMapping("/process")
	public String process(@RequestParam("field") String raghu, Model model) {
		//finding the request and extract form data with help of requestparam
		String s="my name is";
		raghu="My name is"+s;
		//sending the data to form
		model.addAttribute("msg", raghu);
		System.out.print(raghu);
		return "show";
	}

}
