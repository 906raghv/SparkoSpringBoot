package com.springboot.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mvc.dao.StudentImpl;
import com.springboot.mvc.entity.Department;
import com.springboot.mvc.entity.Student;

@Controller
public class HomeController {

	@GetMapping("/")
	public String users(Model model) {
         String s="Raghvendra is here";
         model.addAttribute("student",s);
		return "HomeCon";
	}
	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("department",new Department());
		return "home";
	}
	@PostMapping("/formData")
	public String formdata(@ModelAttribute Department department,Model model) {
		model.addAttribute("department",department);
		return "FormDataShow";
	}
	
}