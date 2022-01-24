package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Books;

@Repository
public interface BookRepository extends CrudRepository<Books, Integer>{

}
