package com.springboot.mvc.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springboot.mvc.entity.Student;

@Repository
@EnableJpaRepositories
public interface StudentDao extends JpaRepository<Student,Integer>{

//userderived method that is made by the user and implements by the jpa data
//	public List<Student> findByfname(String s);
//	@Query("select s from office s")
//	public List<Student> getAllStudent();
//	@Query("select s from office s WHERE s.fname =: n")
//	public List<Student> getStudentByName(@Param("n") String fname);
//
////	public List<Student> findAll();
////	public String findById();
////	public String findByNameAndCity();
	


}
