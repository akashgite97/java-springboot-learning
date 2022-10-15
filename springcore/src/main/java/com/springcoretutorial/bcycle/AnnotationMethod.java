package com.springcoretutorial.bcycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationMethod {

	 String name;

	@Override
	public String toString() {
		return "AnnotationMethod [name=" + name + "]";
	}

	public AnnotationMethod() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Annotation start method");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Annotation end method");
	}
	
}
