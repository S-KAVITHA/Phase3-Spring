package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;



@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	boolean existsByemailId(String emailId);

	boolean existsBypassword(String password);
	
	@Query("select u from User u where u.emailId = :emailId and u.password = :password")
	List<User> findByemailIdAndpassword(String emailId, String password);

}
