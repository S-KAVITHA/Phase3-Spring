package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Products;


public interface ProductsRepository extends CrudRepository<Products, Integer>{

}
