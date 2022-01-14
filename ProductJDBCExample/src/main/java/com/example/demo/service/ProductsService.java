package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Products;
@Service
public interface ProductsService {

	
	int save(Products products);


    int update(Products products);

    int deleteById(int id);

    List<Products> findAll();
    
    Optional<Products> findById(Long id);

}

