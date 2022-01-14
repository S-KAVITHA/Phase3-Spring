package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.batch.BatchAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Products;
import com.example.demo.repository.ProductsRepositoryImpl;
import com.example.demo.service.ProductsService;

@Controller
@EnableAutoConfiguration(exclude= BatchAutoConfiguration.class )
public class HomeController {

	
	@Autowired
	Products products;

	@Autowired
	ProductsService productsService;
	
	@Autowired
	ProductsRepositoryImpl productsrepo;
	
	  @RequestMapping("/List") public ModelAndView
	  passParametersWithModelAndView() {
	  
	  ModelAndView modelAndView = new ModelAndView("listproduct");
	  modelAndView.addObject("Products", productsService.findAll()); 
	  return modelAndView; }
	 
	/*
	 * @RequestMapping("/edit") public ModelAndView editCustomerForm(@RequestParam
	 * long id) { ModelAndView mav = new ModelAndView("updateproduct");
	 * mav.addObject("Products",productsService.findById(id)); //
	 * mav.addObject("Products", product1);
	 * 
	 * return mav; }
	 */
	/*
	 * @RequestMapping("/update") public ModelAndView updateView() {
	 * 
	 * ModelAndView modelAndView = new ModelAndView("updateproduct"); //
	 * modelAndView.addObject("Products", productsService.findAll()); return
	 * modelAndView; }
	 */
	  
	/*
	 * @RequestMapping("/delete") public ModelAndView deleteView() {
	 * 
	 * ModelAndView modelAndView = new ModelAndView("deleteproduct");
	 * //modelAndView.addObject("Products", productsService.findAll()); return
	 * modelAndView; }
	 */

	/*
	 * @RequestMapping(value="/deleteprod/{id}",method = RequestMethod.GET) public
	 * String deleteProduct(@PathVariable int id, Model m){ //
	 * productsServiceimp.findById(id).deleteById(id); return "deleteproduct"; }
	 */
	  
    }
