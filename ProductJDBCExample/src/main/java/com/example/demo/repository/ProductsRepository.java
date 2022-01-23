package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Products;
@Repository
public interface ProductsRepository {

	int save(Products product);

	
	  int update(Products product);
	  
	  int deleteById(int id);
	  
	  List<Products> findAll();


	Optional<Products> findById(int id);
	  
	 

}
