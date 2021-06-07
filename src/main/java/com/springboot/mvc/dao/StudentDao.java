package com.springboot.mvc.dao;


import org.springframework.data.repository.CrudRepository;

import com.springboot.mvc.entity.Student;


public interface StudentDao extends CrudRepository<Student, Integer>{
	


}
