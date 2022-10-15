package com.springcoretutorial.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class RefMain {

	public static void main(String[] args) {
		
		   ApplicationContext context= new ClassPathXmlApplicationContext("com/springcoretutorial/ref/refconfigs.xml");
	        A a=(A) context.getBean("aref");
	        System.out.println(a.getX());
	        
	        
	        System.out.println(a.getObj().getY());
	}

}
