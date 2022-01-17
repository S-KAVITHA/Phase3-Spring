package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Book;
import com.example.demo.model.Products;
import com.example.demo.repository.ProductsRepository;

@Controller

public class HomeController {
	@Autowired
	ProductsRepository productsrepo;
	
	@RequestMapping("/list")
	@ResponseBody
	public List<Products> Addtotable(Products product) {

		return (List<Products>) productsrepo.findAll();
	}
	

	@RequestMapping("/prod/{pid}")
	@ResponseBody
	public Optional<Products> prodbyid(@PathVariable("pid") int pid) {

		return  productsrepo.findById(pid);
	}
	
	
	@RequestMapping("/add")
	
	public Products addproduct(@RequestBody Products product) {

		return  productsrepo.save(product);
	}
	
	
	
}
