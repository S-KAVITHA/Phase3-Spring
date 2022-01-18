package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.example.demo.model.Books;


public interface BookRepository extends CrudRepository<Books, Integer>{
	
	List<Books> findBypublished(int published);
}
