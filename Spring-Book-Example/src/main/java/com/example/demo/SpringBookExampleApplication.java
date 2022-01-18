package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.BookRepository;

@SpringBootApplication
public class SpringBookExampleApplication {
	@Autowired
	BookRepository bookrepository;
	
	
	public static void main(String[] args) {
		
		SpringApplication.run(SpringBookExampleApplication.class, args);
		
	}
	
	
	public void run(String... args) {
        System.out.println("StartApplication...");
        System.out.println("get boks" + bookrepository.findAll());
        
    }
	
}
