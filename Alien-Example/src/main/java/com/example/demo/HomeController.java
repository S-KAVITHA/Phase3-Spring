package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.batch.BatchAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Products;
import com.example.demo.repository.ProductsRepositoryImpl;
import com.example.demo.service.ProductsService;

@Controller
@EnableAutoConfiguration(exclude = BatchAutoConfiguration.class)
public class HomeController {

	@Autowired
	Products products;

	@Autowired
	ProductsService productsService;

	@Autowired
	ProductsRepositoryImpl productsrepo;

	/*
	 * @RequestMapping("/Listproducts") public String viewemp(Model m){ //
	 * List<Student> listp =;
	 * 
	 * System.out.println("students: "+productsService.findAll());
	 * m.addAttribute("Products",productsService.findAll()); return "listproduct"; }
	 */

	@RequestMapping("/addproduct")
	public ModelAndView AddProducts(Products product) {

		ModelAndView modelAndView = new ModelAndView("Home");
		modelAndView.addObject("Products", productsService.save(product));
		return modelAndView;
	}


	@RequestMapping("/Listproducts")
	public ModelAndView passParametersWithModelAndView() {

		ModelAndView modelAndView = new ModelAndView("listproduct");
		modelAndView.addObject("Products", productsService.findAll());
		return modelAndView;
	}

	
	/*
	 * @RequestMapping("/editprod/{id}") public ModelAndView
	 * editCustomerForm(@RequestParam long id) {
	 * 
	 * ModelAndView mav = new ModelAndView("updateproduct");
	 * mav.addObject("Products",productsService.findById(id));
	 * //mav.addObject("Products", Products);
	 * 
	 * return mav; }
	 * 
	 */
	

	  @RequestMapping(value="/editprod/{id}") 
	  public String editprod(@PathVariable Long id, Model m){ 
		 
	  m.addAttribute("Products",productsService.findById(id).get()); 
	  return "updateproduct"; }
	 

	  @RequestMapping(value="/deleteprod/{id}") 
	  public String deleteprod(@PathVariable Long id, Model m){ 
		  Optional<Products> prod =  productsService.findById(id);
	  m.addAttribute("Products",prod.get()); 
	  return "deleteproduct"; }
	 
	
	
	
	/*
	 * @RequestMapping("/delete") public ModelAndView deleteView() {
	 * 
	 * ModelAndView modelAndView = new ModelAndView("deleteproduct");
	 * //modelAndView.addObject("Products", productsService.findAll()); return
	 * modelAndView; }
	 * 
	 */
	/*
	 * @RequestMapping(value = "/deleteprod", method = RequestMethod.GET) public
	 * ModelAndView getUserDetails(@RequestParam Long id) { ModelAndView model = new
	 * ModelAndView("/deleteproduct");
	 * model.addObject("Products",productsService.findById(id));
	 * 
	 * // model.addObject("user", user); return model; }
	 */
	  
	
	/*
	 * @RequestMapping(value="/deleteprod/{id}",method = RequestMethod.GET) public
	 * String deleteProduct(@PathVariable int id, Model m){ //
	 * productsService.deleteById(id); return "deleteproduct"; }
	 */
	 
}
