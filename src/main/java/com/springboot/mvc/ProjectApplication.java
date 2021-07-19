package com.springboot.mvc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.springboot.mvc.dao.StudentDao;
import com.springboot.mvc.entity.Student;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
		
		
	}
//        @Bean
//	    CommandLineRunner CommandLineRunner(StudentDao studentdao) {
//	    	return args ->{
//	    		Student st=new Student("Raghvendra","Tiwari",1);
//	    		studentdao.save(st);
//	    	};
//	    	
//	    }
	    		
	
}
