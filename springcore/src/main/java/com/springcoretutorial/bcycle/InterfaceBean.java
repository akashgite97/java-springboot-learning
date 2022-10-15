package com.springcoretutorial.bcycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class InterfaceBean implements InitializingBean, DisposableBean {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public InterfaceBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "InterfaceBean [name=" + name + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Taking Pepsi");
		
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Interface Destroy method");
		
	}
	
	
	
}
