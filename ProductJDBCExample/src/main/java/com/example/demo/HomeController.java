
package com.example.demo;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.example.demo.model.Products;
import com.example.demo.repository.ProductsRepository;
import com.example.demo.service.ProductsService;

@Controller

public class HomeController {

	@Autowired
	ProductsRepository productsrepo;

	ProductsService productsService;

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
		m.addAttribute("products", productsrepo.findById(id).get());
		return "updateproduct";
	}

	/*
	 * @RequestMapping(value="/updtotable/{id}") public ModelAndView
	 * editsuccessform(@ModelAttribute("updateproduct") Products product
	 * , @PathVariable("id")int id) {
	 * 
	 * // Float n = ; //use it further System.out.println(product);
	 * System.out.println(id);
	 * 
	 * // Products product =
	 * productsService.findById(id).orElseThrow(IllegalArgumentException::new);
	 * product.setPid(id) ; // product.setPrice(product.getPrice());
	 * 
	 * System.out.println(product);
	 * 
	 * ModelAndView model1 = new ModelAndView("editsuccess"); //
	 * model1.addObject("pid",id); productsService.update(product); return model1; }
	 */

	
	
	/*
	 * @RequestMapping(value="/Save",method = RequestMethod.POST) public String
	 * editsave(@ModelAttribute("updateproduct") Products product ){
	 * productsService.update(product); return "Home";
	 * 
	 * }
	 */
	  
	  @PostMapping("/Save")
	    public RedirectView addBook(@ModelAttribute("products") Products products, RedirectAttributes redirectAttributes) {
	        final RedirectView redirectView = new RedirectView("/Home", true);
	        int savedBook = productsService.update(products);
	        redirectAttributes.addFlashAttribute("savedBook", savedBook);
	        redirectAttributes.addFlashAttribute("addBookSuccess", true);
	        return redirectView;
	    } 
	

	  
	  
	/*
	 * @RequestMapping("/updtotable/{id}") public String
	 * editsuccessform(@PathVariable int id, Model m ,HttpServletRequest request) {
	 * 
	 * 
	 * String get_price = request.getParameter("price");
	 * 
	 * float pp = (float) get_price;
	 * 
	 * Products product =
	 * productsService.findById(id).orElseThrow(IllegalArgumentException::new);
	 * product.setPid(id); product.setPrice(get_price);
	 * productsService.update(product);
	 * 
	 * System.out.println(product); System.out.println(get_price);
	 * System.out.println(id); m.addAttribute("pid", id);
	 * 
	 * return "editsuccess"; }
	 */

	/*
	 * @RequestMapping("/updtotable") public ModelAndView Updtotable(Products
	 * product) {
	 * 
	 * ModelAndView modelAndView = new ModelAndView("displayupd");
	 * productsrepo.save(product); modelAndView.addObject("Products", product);
	 * return modelAndView; }
	 */

	@RequestMapping(value = "/deleteprod/{id}")
	public String deleteprod(@PathVariable int id, Model m) {
		productsrepo.deleteById(id);
		m.addAttribute(id);
		return "deleteproduct";
	}

}