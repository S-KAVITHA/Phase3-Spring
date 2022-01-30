package com.example.demo.controller;


import java.net.URI;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale.Category;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.model.Admin;
import com.example.demo.model.Categorys;
import com.example.demo.model.Color;
import com.example.demo.model.Product;
import com.example.demo.model.PurchaseItem;
import com.example.demo.model.Season;
import com.example.demo.model.ShoeType;
import com.example.demo.model.User;
import com.example.demo.repository.AdminRepository;
import com.example.demo.repository.CategorysRepository;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.PurchaseItemRepository;
import com.example.demo.repository.UserRepository;
import com.fasterxml.jackson.annotation.JsonFormat;



//@author Kavitha S


//@Api(value = "SwaggerBookController", description = "REST Apis related to Book Entity!!!!")
@RestController
@RequestMapping("Admin")
public class AdminController {

	@Autowired
	AdminRepository adminrepo;

	@Autowired
	ProductRepository productrepo;

	@Autowired
	CategorysRepository categrepo;

	@Autowired
	UserRepository userrepo;

	@Autowired
	PurchaseItemRepository purchaserepo;

	/*
	 * ---------------------- Admin Operations ----------------------
	 */

	// @ApiOperation(value = "Get list of Books in the System ", response =
	// Iterable.class, tags = "getAllBooks")
	// @ApiResponses(value = {
	// @ApiResponse(code = 200, message = "Suceess|OK"),
	// @ApiResponse(code = 401, message = "not authorized!"),
	// @ApiResponse(code = 403, message = "forbidden!!!"),
	// @ApiResponse(code = 404, message = "not found!!!") })

	@GetMapping("Listadmin")
	public List<Admin> getAllAdmin() {
		List<Admin> admin = (List<Admin>) adminrepo.findAll();
		return admin;
	}

	// @ApiOperation(value = "Get specific Book in the System ", response =
	// Books.class, tags = "getBookById")

	@GetMapping("admin/{id}")
	public Optional<Admin> getadminById(@PathVariable int id) {

		return adminrepo.findById(id);
	}

	// @ApiOperation(value = "Update specific Book in the System ", response
	// =Books.class, tags = "updateBookById")
	@PutMapping("update/{id}")
	public Admin updateadminById(@RequestBody Admin admin, @PathVariable int id) {
		admin.setID(id);
		return adminrepo.save(admin);
	}

	/*
	 * ---------------------- Category Operations ----------------------
	 */

	@PostMapping("addcategory")
	public Categorys addcategory(@RequestBody Categorys category) {
		return categrepo.save(category);
	}

	
	@PutMapping("updatecategory/{id}")
	public Categorys updateCategory(@RequestBody Categorys category ,@PathVariable int id) {
		category.setCategory_Id(id);
		return categrepo.save(category);
	}

	
	@DeleteMapping("deletecategory/{id}")
	public void deleteCategory(@PathVariable int id) {
		categrepo.deleteById(id);
	}

	
	/*
	 * ---------------------- Product Operations ----------------------
	 */

	@PostMapping("addproduct")
	public Product addProduct(@RequestBody Product product) {

		System.out.println(product);
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		String todaysdate = dateFormat.format(date);
		product.setCreatedDate(todaysdate);
		System.out.println(product);
		return productrepo.save(product);
	}

	@DeleteMapping("deleteproduct/{id}")
	public void deleteProduct(@PathVariable int id) {

		productrepo.deleteById(id);
	}

	@PutMapping("updateproduct/{id}")
	public Product updateproduct(@RequestBody Product product, @PathVariable("id") int id) {
		System.out.println(product);
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		String todaysdate = dateFormat.format(date);
		product.setCreatedDate(todaysdate);
		product.setProductId(id);
		System.out.println(product);
		return productrepo.save(product);
	}

	@GetMapping("product/{id}")
	public Optional<Product> getprodById(@PathVariable int id) {

		return productrepo.findById(id);
	}

	// @ApiOperation(value = "Get Books by year in the System ", response =
	// Books.class, tags = "getBookByyear")

	@GetMapping("prodcategory/{category}")
	public List<Product> getProdBycategory(@PathVariable Category category) {
		return productrepo.findBycategory(category);

	}

	@GetMapping("prodseason/{season}")
	public List<Product> getProdByseason(@PathVariable Season season) {
		return productrepo.findByseason(season);

	}

	@GetMapping("prodshoetype/{shoetype}")
	public List<Product> getByshoetype(@PathVariable ShoeType shoetype) {
		return productrepo.findByshoetype(shoetype);

	}

	@GetMapping("prodprice/{price}")
	public List<Product> getProdByprice(@PathVariable float price) {
		return productrepo.findByprice(price);

	}

	@GetMapping("prodcolor/{color}")
	public List<Product> getProdBycolor(@PathVariable Color color) {
		return productrepo.findBycolor(color);

	}

	@GetMapping("proddate/{createdDate}")
	public List<Product> getProdBycreatedDate(@PathVariable String createdDate) {
		return productrepo.findBycreatedDate(createdDate);

	}

	/*
	 * ---------------------- User Operations ----------------------
	 */

	
	@PostMapping("addusers")
	public User addusers(@RequestBody User users) {

		return userrepo.save(users);
	}

	@GetMapping("listusers")
	public List<User> getAllusers() {
		List<User> user = (List<User>) userrepo.findAll();
		return user;
	}

	@DeleteMapping("deleteuser/{id}")
	public void deleteuser(@PathVariable int id) {

		userrepo.deleteById(id);
	}

	@PutMapping("updateuser/{id}")
	public User updateuser(@RequestBody User user ,@PathVariable int id) {
		user.setID(id);
		return userrepo.save(user);
	}
	

	/*
	 * ---------------------- Purchase Operations ----------------------
	 */

	@PostMapping("addpurchaseitem")
	public PurchaseItem addpurchaseitem(@RequestBody PurchaseItem purchaseitem) {
		System.out.println(purchaseitem);
		return purchaserepo.save(purchaseitem);
	}

	@DeleteMapping("deletepurchase/{id}")
	public void deletePurchase(@PathVariable int id) {

		purchaserepo.deleteById(id);
	}

	@PutMapping("updatepurchase/{id}")
	public PurchaseItem updatepurchase(@RequestBody PurchaseItem purchaseitem ,@PathVariable int id) {
		purchaseitem.setProductId(id);
		System.out.println(purchaseitem);
		System.out.println(id);
		
		return purchaserepo.save(purchaseitem);
	}

	@GetMapping("purchasedate/{purchaseDate}")
	public List<PurchaseItem> getpurchasedate(@PathVariable String purchaseDate) {

		return purchaserepo.findBypurchaseDate(purchaseDate);

	}

	@GetMapping("prodcategory/{prodCategory}")
	public List<PurchaseItem> getprodCategory(@PathVariable String prodCategory) {

		return purchaserepo.findBypurchaseDate(prodCategory);

	}

}
