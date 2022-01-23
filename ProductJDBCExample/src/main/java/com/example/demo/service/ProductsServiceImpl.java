package com.example.demo.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Products;
import com.example.demo.repository.ProductsRepository;

@Service
public class ProductsServiceImpl implements ProductsService{

	@Autowired
	ProductsRepository productsRepository;
	
	
	@Override
	public int save(Products products) {
		return productsRepository.save(products);
	}

	@Override
	public int update(Products products) {
		return productsRepository.update(products);
	}

	@Override
	public int deleteById(int id) {
		return productsRepository.deleteById(id);
	}

	@Override
	public List<Products> findAll() {
		return productsRepository.findAll();
	}

	@Override
	public Optional<Products> findById(int id) {
		return productsRepository.findById(id);
	}
}



