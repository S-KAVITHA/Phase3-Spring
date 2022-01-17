package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Products;
import com.example.demo.repository.ProductsRepository;

@RestController

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

		return productsrepo.findById(pid);
	}

	@PostMapping("/add")
	public Products addproduct(@RequestBody Products product) {

		return productsrepo.save(product);
		// return product;

	}

	@PutMapping("update/{id}")
	public Products updateBookById(@RequestBody Products Products) {
		return productsrepo.save(Products);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteBook(@PathVariable int id) {
		productsrepo.deleteById(id);
	}

	@DeleteMapping("/deleteall")
	public void deleteAllproducts() {
		productsrepo.deleteAll();
	}

	@RequestMapping("/pricelist/{price}")
	
	public Products findByprice(@PathVariable("price") int price) {
		return (Products) productsrepo.findByprice(price);
		 
	}

	


	
}
