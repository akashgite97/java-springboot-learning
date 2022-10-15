package com.springcoretutorial.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CIMain {

	private static ApplicationContext context;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		context = new ClassPathXmlApplicationContext("com/springcoretutorial/ci/ciconfigs.xml");
		
		Person p1= (Person) context.getBean("personBean");
		System.out.print(p1);
		
		

	}

}
