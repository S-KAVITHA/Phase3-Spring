
package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Products;
import com.example.demo.repository.ProductsRepository;

@Controller

public class HomeController {

	@Autowired
	ProductsRepository productsrepo;

	@RequestMapping("/Home")
	public ModelAndView HomePage() {

		ModelAndView modelAndView = new ModelAndView("Home");

		return modelAndView;
	}

	@RequestMapping("/addproduct")
	public ModelAndView AddProducts() {

		ModelAndView modelAndView = new ModelAndView("addproduct");

		return modelAndView;
	}

	@RequestMapping("/addtotable")
	public ModelAndView Addtotable(Products product) {

		ModelAndView modelAndView = new ModelAndView("addproduct");
		productsrepo.save(product);
		modelAndView.addObject("Products", "Product added Successfully!!!");
		return modelAndView;
	}

	@RequestMapping("/Listproducts")
	public ModelAndView ListProducts() {

		ModelAndView modelAndView = new ModelAndView("listproduct");
		modelAndView.addObject("Products", productsrepo.findAll());
		return modelAndView;
	}


	@RequestMapping("/updtotable")
	public ModelAndView Updtotable(Products product) {

		ModelAndView modelAndView = new ModelAndView("displayupd");
		productsrepo.save(product);
		modelAndView.addObject("Products", product);
		return modelAndView;
	}

	/*
	 * 
	 * @RequestMapping(value = "/editprod/updprod/{id}") public String
	 * updprod(@PathVariable int id, int price, Model m) {
	 * 
	 * Products productupd = productsrepo.findById(id).get();
	 * productupd.setPrice(price); productsrepo.save(productupd);
	 * 
	 * System.out.println(price); System.out.println(productupd);
	 * System.out.println(id); m.addAttribute("Products", productupd); return
	 * "displayupd"; }
	 */

	@RequestMapping(value = "/editprod/{id}")
	public String editprod(@PathVariable int id, Model m) {
		m.addAttribute("Products", productsrepo.findById(id).get());
		return "updateproduct";
	}

	@RequestMapping(value = "/deleteprod/{id}")
	public String deleteprod(@PathVariable int id, Model m) {
		productsrepo.deleteById(id);
		m.addAttribute(id);
		return "deleteproduct";
	}

}