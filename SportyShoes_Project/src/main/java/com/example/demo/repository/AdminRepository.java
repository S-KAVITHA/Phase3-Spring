package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {

	boolean existsByadminId(String adminId);

	boolean existsByadminpwd(String pwd);

	@Query("select a from Admin a where a.adminId = :adminId and a.adminpwd = :adminPwd")
	Admin findByadminIdAndadminpwd(@Param("adminId") String adminId, @Param("adminPwd") String adminPwd);
}
