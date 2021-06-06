package com.springboot.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/parent")
public class DashController {

	@RequestMapping("/process")
	public String process() {
		return "page";
	}
}
