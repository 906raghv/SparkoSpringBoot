package com.springboot.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.mvc.dao.StudentDao;
import com.springboot.mvc.entity.Student;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
	@Autowired
	private StudentDao studentdao;
	
	public Student saveStudent(Student stu) {
		return  studentdao.save(stu);
	}
	public List <Student> saveStudents(List <Student> stus) {
		return  (List<Student>) studentdao.saveAll(stus);
	}
	public List <Student> getStudents() {
		return  (List<Student>) studentdao.findAll();
	}
	public Optional<Student> get(int id) {
		return  studentdao.findById(id);
	}
}
