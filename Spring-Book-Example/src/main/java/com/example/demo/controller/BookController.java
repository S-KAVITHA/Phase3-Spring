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

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;

@RestController
@RequestMapping("book")
public class BookController {

	@Autowired
	BookRepository bookrepository;
	
	
	@GetMapping("all")
	public List<Book> getAllBooks()
	{
		List<Book> book =(List<Book>) bookrepository.findAll();
		return book;
	}
	
	

	@GetMapping("book/{id}")
	public Optional<Book> getBookById(@PathVariable int id)
	{
		return bookrepository.findById(id);
	}
	
	
	
	@PostMapping("add")
	public Book createBook(@RequestBody Book book)
	{
		return bookrepository.save(book);
	}
	

	@PutMapping("update/{id}")
	public Book updateBookById(@RequestBody Book book)
	{
		return bookrepository.save(book);
	}
	
	
	@DeleteMapping("delete/{id}")
	public void deleteBook(@PathVariable int id)
	{
		bookrepository.deleteById(id);
	}

	/*
	 * @DeleteMapping("delete/{id}") public void deleteAllBook(@PathVariable int id)
	 * { bookrepository.deleteById(id); }
	 * 
	 * 
	 * @DeleteMapping("delete/{id}") public void findByPublishedYear(@PathVariable
	 * int id) { bookrepository.deleteById(id); }
	 */
}
