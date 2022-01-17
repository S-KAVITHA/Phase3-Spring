package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@SpringBootApplication
@EnableJdbcRepositories(basePackages="com.example.demo")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})

public class SpringAlienEgApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAlienEgApplication.class, args);
	}

}