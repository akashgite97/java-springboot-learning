package com.springcoretutorial.bcycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CycleMain {

	public static void main(String[] args) {

		AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/springcoretutorial/bcycle/configs.xml");
		Beancycle b= (Beancycle) context.getBean("blifecycle");
		
		System.out.println(b);
		context.registerShutdownHook();

		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		InterfaceBean i1= (InterfaceBean) context.getBean("interfaceMethod");
		System.out.println(i1);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		
		AnnotationMethod a1= (AnnotationMethod) context.getBean("annotationMethod");
		System.out.println(a1);
		
		
		
		
		
		
	}

}
