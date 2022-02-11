package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.demo")
public class SportyShoesProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportyShoesProjectApplication.class, args);
	}

}
