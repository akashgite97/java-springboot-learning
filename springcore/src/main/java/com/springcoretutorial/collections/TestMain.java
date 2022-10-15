package com.springcoretutorial.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcoretutorial/collections/econfigs.xml");
		
		Employee emp=(Employee) context.getBean("emp");
		
		System.out.print(emp.getName());
		System.out.print(emp.getPhones());
		System.out.print(emp.getAddresses());
		System.out.print(emp.getCourses());
		

	}

}
