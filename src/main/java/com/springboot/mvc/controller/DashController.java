package com.springboot.mvc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mvc.entity.Student;
import com.springboot.mvc.service.StudentService;

@Controller
public class DashController {
	
	private StudentService service;
       
	@GetMapping("/page")
	public String ppc() {
		return "page";
	}

	@PostMapping("/msg")
	public Student add(@RequestParam(name = "lname") String lname,
			           @RequestParam(name ="fname") String fname,
			           Student student) {
		System.out.print(fname+"I am faddu"+lname);
		return service.saveStudent(student);
		
		
	}
	@PostMapping("/addStudent")
	public List <Student> addStudent(List <Student> students) {
		return service.saveStudents(students);
		
	}
	@GetMapping("/findStudent/{id}")
	public Optional<Student> get(@PathVariable int id) {
		return service.get(id);
		
	}
	@GetMapping("/findAllStudent")
	public List<Student> gets() {
		return service.getStudents();
		
	}
	
}
