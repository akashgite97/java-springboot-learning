package com.api.book.bootrestbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.api.book.bootrestbook.controllers","com.api.book.bootrestbook.entity","com.api.book.bootrestbook.service","com.api.book.bootrestbook.dao"})
@EntityScan(basePackages = {"com.api.book.bootrestbook.entity"})
@EnableAutoConfiguration
public class BootrestbookApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootrestbookApplication.class, args);
	
	}

}
