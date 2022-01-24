package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.BookRepository;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication

public class SpringBookExampleApplication {
	
	
	public static void main(String[] args) {
		
		SpringApplication.run(SpringBookExampleApplication.class, args);
		
	}
	
	
}
