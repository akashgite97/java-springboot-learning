package com.springcoretutorial.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages=" com.springcoretutorial.javaconfig")
public class JavaConfig {
	@Bean
	public Teacher getTeacher() {
		return new Teacher();
	}
	
	@Bean(name= {"student","temp"})
	public Student getName() {
		Student student= new Student();
		return student;
	}
	

}
