package com.springboot.mvc.controller;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mvc.entity.Student;
import com.springboot.mvc.service.StudentService;

@Controller
public class HomeController {
	@Autowired
	private StudentService service;
	@RequestMapping("/")
	public String pp() {
		return "home";
	}
	@PostMapping("/process")
	public String process(@RequestParam("fname") String fname,
			@RequestParam("lname") String lname, Student para) {
		int id=0;
		System.out.print(fname+"This is me"+lname);
		Student exist=new Student(fname,lname,id);
		para=exist;
		
//		Student pass = null;
//		pass.setLname(lname);
//		service.saveStudent(username);
		service.saveStudent(para);
		//finding the request and extract form data with help of requestparam
//		String s="my name is";
//		raghu="My name is"+s;
//		//sending the data to form
//		model.addAttribute("msg", raghu);
//		System.out.print(raghu);
		return "show";
	}
	private void setFname(String fname) {
		// TODO Auto-generated method stub
		
	}
    
}
