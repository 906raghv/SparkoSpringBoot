package com.springboot.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.mvc.entity.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	@RequestMapping("/show")
	public String show(Model theModel) {
		//create student obj
		Student st=new Student();
		//add student obj in model
		theModel.addAttribute("student", st);
		return "studentform";
	}
	@PostMapping("/register")
	public String submitForm(@ModelAttribute("student") Student student) {
	    System.out.println(student);
	    return "register_success";
	}
}
