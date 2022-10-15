package com.springcoretutorial.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcoretutorial/spel/spelconfigs.xml");
        Demo a= context.getBean("demo",Demo.class );
        System.out.println(a);
        
        SpelExpressionParser s1=new SpelExpressionParser();
        Expression exp=s1.parseExpression("2+6");
        
        System.out.println(exp.getValue());
        
        

	}

}
