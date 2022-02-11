package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Categorys;




@Repository
public interface CategorysRepository extends CrudRepository<Categorys, Long>{

}