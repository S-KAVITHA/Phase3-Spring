package com.onlyxcodes.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.onlyxcodes.app.model.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
