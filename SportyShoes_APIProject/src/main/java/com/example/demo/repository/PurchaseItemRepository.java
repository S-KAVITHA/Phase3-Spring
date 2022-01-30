package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Admin;
import com.example.demo.model.Product;
import com.example.demo.model.PurchaseItem;



@Repository
public interface PurchaseItemRepository extends JpaRepository<PurchaseItem, Integer>{

	List<PurchaseItem> findBypurchaseDate(String purchaseDate);
	List<PurchaseItem> findByprodCategory(int prodCategory);
	
}
