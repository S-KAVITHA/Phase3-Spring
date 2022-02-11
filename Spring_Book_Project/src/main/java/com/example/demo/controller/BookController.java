package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.handling.BookNotFoundException;
import com.example.demo.model.Books;
import com.example.demo.repository.BookRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "SwaggerBookController", description = "REST Apis related to Book Entity!!!!")
@RestController
//@RequestMapping("book")
public class BookController {

	@Autowired
	BookRepository bookrepository;
	
	
	@ApiOperation(value = "Get list of Books in the System ", response = Iterable.class, tags = "getAllBooks")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Suceess|OK"),
			@ApiResponse(code = 401, message = "not authorized!"), 
			@ApiResponse(code = 403, message = "forbidden!!!"),
			@ApiResponse(code = 404, message = "not found!!!") })
	
	@GetMapping("all")
	public List<Books> getAllBooks()
	{
		List<Books> book =(List<Books>) bookrepository.findAll();
		return book;
	}
	
	
	
	@ApiOperation(value = "Get specific Book in the System ", response = Books.class, tags = "getBookById")
	@GetMapping("book/{id}")
	public Books getBookById(@PathVariable int id) throws BookNotFoundException 
	{
		//String messgae = " Book Not Found";
		return bookrepository.findById(id).orElseThrow(() -> new BookNotFoundException("Book with id " + id + " not found"));
		
	}
	
	
	
	
	@ApiOperation(value = "Create Book in the System ", response = Books.class, tags = "createBook")
	@PostMapping("add")
	public Books createBook(@RequestBody Books book)
	{
		return bookrepository.save(book);
	}
	
	
	
	@ApiOperation(value = "Update specific Book in the System ", response = Books.class, tags = "updateBookById")
	@PutMapping("update/{id}")
	public Books updateBookById(@RequestBody Books book)
	{
		return bookrepository.save(book);
	}
	
	
	
	@ApiOperation(value = "Delete specific Book in the System ", response = Books.class, tags = "deleteBook")
	@DeleteMapping("delete/{id}")
	public void deleteBook(@PathVariable int id)
	{
		bookrepository.deleteById(id);
	}

	
}
