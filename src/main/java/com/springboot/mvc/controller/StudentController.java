package com.springboot.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.mvc.entity.Student;

@Controller
@RequestMapping("/parent")
public class StudentController {
	private List<Student> theStudent;
	
	@RequestMapping("/show")
	public String show(Model theModel) {
		//create student obj
		Student st=new Student();
		//add student obj in model
		theModel.addAttribute("student", st);
		return "page";
	}
	@PostMapping("/register")
	public String submitForm(@ModelAttribute("student") Student student) {
	    System.out.println(student);
	    return "register_success"; 
	}
//	@GetMapping("/stu")
//	public String sl(Model model) {
//		
////		Student s1=new Student("Raghv","tiwari", 2);
////		Student s2=new Student("Raghvndra","tiwari", 2);
////		Student s3=new Student("Rag","tiwari", 2);
////		List<Student> mr=new ArrayList();
////		mr.add(s3);
////		mr.add(s2);
////		mr.add(s1);
////		model.addAttribute("message",mr);
////		return "show";
////		
//	}
//	
//	@PostConstruct
//	public void loadData() {
//		theStudent=new ArrayList();
//		theStudent.add(new Student("Raghv","tiwari", 2));
//		theStudent.add(new Student("Raghvendra","Tiear", 5));
//		theStudent.add(new Student("Manager","tiwari", 8));
//	}
//	@GetMapping("/spp")
//	public List<Student> getSty(){
//		return theStudent;
//	}
			
}
