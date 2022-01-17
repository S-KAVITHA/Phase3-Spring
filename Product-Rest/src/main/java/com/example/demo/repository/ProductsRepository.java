package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Products;


public interface ProductsRepository extends JpaRepository<Products, Integer>{

	List <Products> findByprice(int price);
	
}
