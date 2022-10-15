package com.springcoretutorial.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcoretutorial/auto/wire/annotation/annotationconfigs.xml");
        Emp e= context.getBean("emp1",Emp.class);
        
        System.out.println(e);
		
	}

}
