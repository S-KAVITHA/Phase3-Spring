package com.example.demo.repository;

import java.util.List;
import java.util.Locale.Category;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Color;
import com.example.demo.model.Product;
import com.example.demo.model.Season;
import com.example.demo.model.ShoeType;


@Repository
@Transactional
public interface ProductRepository extends JpaRepository<Product, Long>{

	List<Product> findBycategory(Category category);
	List<Product> findByseason(Season season);
	List<Product> findByshoetype(ShoeType shoetype);
	List<Product> findByprice(float price);
	List<Product> findBycolor(Color color);
	List<Product> findBycreatedDate(String createdDate);

}
