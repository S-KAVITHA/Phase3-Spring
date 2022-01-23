package com.example.demo;

import java.util.Arrays;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.model.Products;
import com.example.demo.service.ProductsService;



@SpringBootApplication

public class ProductJdbcExampleApplication implements CommandLineRunner{

	@Autowired
		ProductsService productsService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProductJdbcExampleApplication.class, args);
	}

	@Override
    public void run(String... args) {
        System.out.println("StartApplication...");
        testProductData();
    }

    void testProductData() {

		
		/*
		 * List<Products> products = Arrays.asList( new Products(1,"Honey", 16), new
		 * Products(4,"Cake", 15) );
		 * 
		 * System.out.println("[SAVE]"); products.forEach(product -> {
		 * System.out.println("Saving products with name: "+product.getProd_name());
		 * productsService.save(product); });
		 */
        
		
		  // find all
		  System.out.println("get All students: "+productsService.findAll());
		  
		  // find by id System.out.println("Find Student with id 2"); 
		  
		  Products product = productsService.findById(64).orElseThrow(IllegalArgumentException::new);
		  System.out.println("Student with id 2: "+product);
		  
		  // update System.out.println("Update age of row 5 to 19");
		  product.setPid(64);
		  product.setPrice(200);
		  System.out.println("Rows affected: "+productsService.update(product));
		  
		  // delete System.out.println("Delete Student with id 4");
		  System.out.println("Rows affected: "+ productsService.deleteById(1));
		  
		  // find all
		  System.out.println("get updated list of Students: "+productsService.findAll())
		  ;
		 
		 
    }
             
       
        
         
}
