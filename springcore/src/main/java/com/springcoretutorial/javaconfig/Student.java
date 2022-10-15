package com.springcoretutorial.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("firstStudent")
public class Student {
	

	private Teacher teacher;
	
	@Value("Config without XML")
	private String name;

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
		this.teacher.displayName();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	
	
	
}
