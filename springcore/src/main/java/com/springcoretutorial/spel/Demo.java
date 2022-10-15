package com.springcoretutorial.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{2+2}")
	private String name;
	
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private int value;
	
	@Value("#{5<23}")
    private boolean isActive;
	
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Demo [name=" + name + ", value=" + value + ", isActive=" + isActive + "]";
	}

	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
	
	

	

}
