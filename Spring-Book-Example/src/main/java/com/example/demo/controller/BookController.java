package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.exception.handling.BookNotFoundException;
import com.example.demo.model.Books;
import com.example.demo.repository.BookRepository;


@RestController
@RequestMapping("/Books")
public class BookController {

	@Autowired
	BookRepository bookrepository;

	@GetMapping("list")
	public List<Books> getAllBooks() {
		// List<Book> book =(List<Book>) bookrepository.findAll();
		return (List<Books>) bookrepository.findAll();

	}

	@GetMapping("id/{id}")
	public Optional<Books> getBookById(@PathVariable int id) throws BookNotFoundException {

		
		bookrepository.findById(id).orElseThrow(() -> new BookNotFoundException("Book not found for this id :: " + id));  
		return bookrepository.findById(id);

	}

	@PostMapping("/add")
	public Books createBook(@RequestBody Books book) {
		return bookrepository.save(book);
	}

	@PutMapping("update/{id}")
	public Books updateBookById(@RequestBody Books book) {
		return bookrepository.save(book);
	}

	@DeleteMapping("delete/{id}")
	public void deleteBook(@PathVariable int id) {
		bookrepository.deleteById(id);
	}

	@DeleteMapping("/deleteall")
	public void deleteAllproducts() {
		bookrepository.deleteAll();
	}

	@RequestMapping("/publishlist/{published}")

	public List<Books> findByprice(@PathVariable("published") int published) {

		return bookrepository.findBypublished(published);

	}
}
